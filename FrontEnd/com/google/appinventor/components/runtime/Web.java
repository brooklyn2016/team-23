package com.google.appinventor.components.runtime;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.HtmlEntities;
import com.google.appinventor.components.runtime.collect.Lists;
import com.google.appinventor.components.runtime.collect.Maps;
import com.google.appinventor.components.runtime.util.AsynchUtil;
import com.google.appinventor.components.runtime.util.ErrorMessages;
import com.google.appinventor.components.runtime.util.FileUtil;
import com.google.appinventor.components.runtime.util.FileUtil.FileException;
import com.google.appinventor.components.runtime.util.GingerbreadUtil;
import com.google.appinventor.components.runtime.util.JsonUtil;
import com.google.appinventor.components.runtime.util.MediaUtil;
import com.google.appinventor.components.runtime.util.NanoHTTPD;
import com.google.appinventor.components.runtime.util.SdkLevel;
import com.google.appinventor.components.runtime.util.YailList;
import gnu.expr.LambdaExp;
import gnu.kawa.xml.ElementType;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.XML;

@DesignerComponent(category = ComponentCategory.CONNECTIVITY, description = "Non-visible component that provides functions for HTTP GET, POST, PUT, and DELETE requests.", iconName = "images/web.png", nonVisible = true, version = 4)
@UsesLibraries(libraries = "json.jar")
@SimpleObject
@UsesPermissions(permissionNames = "android.permission.INTERNET,android.permission.WRITE_EXTERNAL_STORAGE,android.permission.READ_EXTERNAL_STORAGE")
public class Web extends AndroidNonvisibleComponent implements Component {
    private static final String LOG_TAG = "Web";
    private static final Map<String, String> mimeTypeToExtension;
    private final Activity activity;
    private boolean allowCookies;
    private final CookieHandler cookieHandler;
    private YailList requestHeaders;
    private String responseFileName;
    private boolean saveResponse;
    private String urlString;

    /* renamed from: com.google.appinventor.components.runtime.Web.1 */
    class C01231 implements Runnable {
        final /* synthetic */ CapturedProperties val$webProps;

        C01231(CapturedProperties capturedProperties) {
            this.val$webProps = capturedProperties;
        }

        public void run() {
            try {
                Web.this.performRequest(this.val$webProps, null, null, "GET");
            } catch (FileException e) {
                Web.this.form.dispatchErrorOccurredEvent(Web.this, "Get", e.getErrorMessageNumber(), new Object[0]);
            } catch (Exception e2) {
                Log.e(Web.LOG_TAG, "ERROR_UNABLE_TO_GET", e2);
                Web.this.form.dispatchErrorOccurredEvent(Web.this, "Get", ErrorMessages.ERROR_WEB_UNABLE_TO_GET, this.val$webProps.urlString);
            }
        }
    }

    /* renamed from: com.google.appinventor.components.runtime.Web.2 */
    class C01242 implements Runnable {
        final /* synthetic */ String val$path;
        final /* synthetic */ CapturedProperties val$webProps;

        C01242(CapturedProperties capturedProperties, String str) {
            this.val$webProps = capturedProperties;
            this.val$path = str;
        }

        public void run() {
            try {
                Web.this.performRequest(this.val$webProps, null, this.val$path, "POST");
            } catch (FileException e) {
                Web.this.form.dispatchErrorOccurredEvent(Web.this, "PostFile", e.getErrorMessageNumber(), new Object[0]);
            } catch (Exception e2) {
                Web.this.form.dispatchErrorOccurredEvent(Web.this, "PostFile", ErrorMessages.ERROR_WEB_UNABLE_TO_POST_OR_PUT_FILE, this.val$path, this.val$webProps.urlString);
            }
        }
    }

    /* renamed from: com.google.appinventor.components.runtime.Web.3 */
    class C01253 implements Runnable {
        final /* synthetic */ String val$path;
        final /* synthetic */ CapturedProperties val$webProps;

        C01253(CapturedProperties capturedProperties, String str) {
            this.val$webProps = capturedProperties;
            this.val$path = str;
        }

        public void run() {
            try {
                Web.this.performRequest(this.val$webProps, null, this.val$path, "PUT");
            } catch (FileException e) {
                Web.this.form.dispatchErrorOccurredEvent(Web.this, "PutFile", e.getErrorMessageNumber(), new Object[0]);
            } catch (Exception e2) {
                Web.this.form.dispatchErrorOccurredEvent(Web.this, "PutFile", ErrorMessages.ERROR_WEB_UNABLE_TO_POST_OR_PUT_FILE, this.val$path, this.val$webProps.urlString);
            }
        }
    }

    /* renamed from: com.google.appinventor.components.runtime.Web.4 */
    class C01264 implements Runnable {
        final /* synthetic */ CapturedProperties val$webProps;

        C01264(CapturedProperties capturedProperties) {
            this.val$webProps = capturedProperties;
        }

        public void run() {
            try {
                Web.this.performRequest(this.val$webProps, null, null, "DELETE");
            } catch (FileException e) {
                Web.this.form.dispatchErrorOccurredEvent(Web.this, "Delete", e.getErrorMessageNumber(), new Object[0]);
            } catch (Exception e2) {
                Web.this.form.dispatchErrorOccurredEvent(Web.this, "Delete", ErrorMessages.ERROR_WEB_UNABLE_TO_DELETE, this.val$webProps.urlString);
            }
        }
    }

    /* renamed from: com.google.appinventor.components.runtime.Web.5 */
    class C01275 implements Runnable {
        final /* synthetic */ String val$encoding;
        final /* synthetic */ String val$functionName;
        final /* synthetic */ String val$httpVerb;
        final /* synthetic */ String val$text;
        final /* synthetic */ CapturedProperties val$webProps;

        C01275(String str, String str2, String str3, CapturedProperties capturedProperties, String str4) {
            this.val$encoding = str;
            this.val$text = str2;
            this.val$functionName = str3;
            this.val$webProps = capturedProperties;
            this.val$httpVerb = str4;
        }

        public void run() {
            try {
                byte[] requestData;
                if (this.val$encoding == null || this.val$encoding.length() == 0) {
                    requestData = this.val$text.getBytes("UTF-8");
                } else {
                    requestData = this.val$text.getBytes(this.val$encoding);
                }
                try {
                    Web.this.performRequest(this.val$webProps, requestData, null, this.val$httpVerb);
                } catch (FileException e) {
                    Web.this.form.dispatchErrorOccurredEvent(Web.this, this.val$functionName, e.getErrorMessageNumber(), new Object[0]);
                } catch (Exception e2) {
                    Web.this.form.dispatchErrorOccurredEvent(Web.this, this.val$functionName, ErrorMessages.ERROR_WEB_UNABLE_TO_POST_OR_PUT, this.val$text, this.val$webProps.urlString);
                }
            } catch (UnsupportedEncodingException e3) {
                Web.this.form.dispatchErrorOccurredEvent(Web.this, this.val$functionName, ErrorMessages.ERROR_WEB_UNSUPPORTED_ENCODING, this.val$encoding);
            }
        }
    }

    /* renamed from: com.google.appinventor.components.runtime.Web.6 */
    class C01286 implements Runnable {
        final /* synthetic */ String val$path;
        final /* synthetic */ int val$responseCode;
        final /* synthetic */ String val$responseType;
        final /* synthetic */ CapturedProperties val$webProps;

        C01286(CapturedProperties capturedProperties, int i, String str, String str2) {
            this.val$webProps = capturedProperties;
            this.val$responseCode = i;
            this.val$responseType = str;
            this.val$path = str2;
        }

        public void run() {
            Web.this.GotFile(this.val$webProps.urlString, this.val$responseCode, this.val$responseType, this.val$path);
        }
    }

    /* renamed from: com.google.appinventor.components.runtime.Web.7 */
    class C01297 implements Runnable {
        final /* synthetic */ int val$responseCode;
        final /* synthetic */ String val$responseContent;
        final /* synthetic */ String val$responseType;
        final /* synthetic */ CapturedProperties val$webProps;

        C01297(CapturedProperties capturedProperties, int i, String str, String str2) {
            this.val$webProps = capturedProperties;
            this.val$responseCode = i;
            this.val$responseType = str;
            this.val$responseContent = str2;
        }

        public void run() {
            Web.this.GotText(this.val$webProps.urlString, this.val$responseCode, this.val$responseType, this.val$responseContent);
        }
    }

    static class BuildRequestDataException extends Exception {
        final int errorNumber;
        final int index;

        BuildRequestDataException(int errorNumber, int index) {
            this.errorNumber = errorNumber;
            this.index = index;
        }
    }

    private static class CapturedProperties {
        final boolean allowCookies;
        final Map<String, List<String>> cookies;
        final Map<String, List<String>> requestHeaders;
        final String responseFileName;
        final boolean saveResponse;
        final URL url;
        final String urlString;

        CapturedProperties(Web web) throws MalformedURLException, InvalidRequestHeadersException {
            this.urlString = web.urlString;
            this.url = new URL(this.urlString);
            this.allowCookies = web.allowCookies;
            this.saveResponse = web.saveResponse;
            this.responseFileName = web.responseFileName;
            this.requestHeaders = Web.processRequestHeaders(web.requestHeaders);
            Map<String, List<String>> cookiesTemp = null;
            if (this.allowCookies && web.cookieHandler != null) {
                try {
                    cookiesTemp = web.cookieHandler.get(this.url.toURI(), this.requestHeaders);
                } catch (URISyntaxException e) {
                } catch (IOException e2) {
                }
            }
            this.cookies = cookiesTemp;
        }
    }

    private static class InvalidRequestHeadersException extends Exception {
        final int errorNumber;
        final int index;

        InvalidRequestHeadersException(int errorNumber, int index) {
            this.errorNumber = errorNumber;
            this.index = index;
        }
    }

    static {
        mimeTypeToExtension = Maps.newHashMap();
        mimeTypeToExtension.put("application/pdf", "pdf");
        mimeTypeToExtension.put("application/zip", "zip");
        mimeTypeToExtension.put("audio/mpeg", "mpeg");
        mimeTypeToExtension.put("audio/mp3", "mp3");
        mimeTypeToExtension.put("audio/mp4", "mp4");
        mimeTypeToExtension.put("image/gif", "gif");
        mimeTypeToExtension.put("image/jpeg", "jpg");
        mimeTypeToExtension.put("image/png", "png");
        mimeTypeToExtension.put("image/tiff", "tiff");
        mimeTypeToExtension.put(NanoHTTPD.MIME_PLAINTEXT, "txt");
        mimeTypeToExtension.put(NanoHTTPD.MIME_HTML, "html");
        mimeTypeToExtension.put(NanoHTTPD.MIME_XML, "xml");
    }

    public Web(ComponentContainer container) {
        super(container.$form());
        this.urlString = ElementType.MATCH_ANY_LOCALNAME;
        this.requestHeaders = new YailList();
        this.responseFileName = ElementType.MATCH_ANY_LOCALNAME;
        this.activity = container.$context();
        this.cookieHandler = SdkLevel.getLevel() >= 9 ? GingerbreadUtil.newCookieManager() : null;
    }

    protected Web() {
        super(null);
        this.urlString = ElementType.MATCH_ANY_LOCALNAME;
        this.requestHeaders = new YailList();
        this.responseFileName = ElementType.MATCH_ANY_LOCALNAME;
        this.activity = null;
        this.cookieHandler = null;
    }

    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "The URL for the web request.")
    public String Url() {
        return this.urlString;
    }

    @DesignerProperty(defaultValue = "", editorType = "string")
    @SimpleProperty
    public void Url(String url) {
        this.urlString = url;
    }

    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "The request headers, as a list of two-element sublists. The first element of each sublist represents the request header field name. The second element of each sublist represents the request header field values, either a single value or a list containing multiple values.")
    public YailList RequestHeaders() {
        return this.requestHeaders;
    }

    @SimpleProperty
    public void RequestHeaders(YailList list) {
        try {
            processRequestHeaders(list);
            this.requestHeaders = list;
        } catch (InvalidRequestHeadersException e) {
            this.form.dispatchErrorOccurredEvent(this, "RequestHeaders", e.errorNumber, Integer.valueOf(e.index));
        }
    }

    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "Whether the cookies from a response should be saved and used in subsequent requests. Cookies are only supported on Android version 2.3 or greater.")
    public boolean AllowCookies() {
        return this.allowCookies;
    }

    @DesignerProperty(defaultValue = "false", editorType = "boolean")
    @SimpleProperty
    public void AllowCookies(boolean allowCookies) {
        this.allowCookies = allowCookies;
        if (allowCookies && this.cookieHandler == null) {
            this.form.dispatchErrorOccurredEvent(this, "AllowCookies", 4, new Object[0]);
        }
    }

    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "Whether the response should be saved in a file.")
    public boolean SaveResponse() {
        return this.saveResponse;
    }

    @DesignerProperty(defaultValue = "false", editorType = "boolean")
    @SimpleProperty
    public void SaveResponse(boolean saveResponse) {
        this.saveResponse = saveResponse;
    }

    @SimpleProperty(category = PropertyCategory.BEHAVIOR, description = "The name of the file where the response should be saved. If SaveResponse is true and ResponseFileName is empty, then a new file name will be generated.")
    public String ResponseFileName() {
        return this.responseFileName;
    }

    @DesignerProperty(defaultValue = "", editorType = "string")
    @SimpleProperty
    public void ResponseFileName(String responseFileName) {
        this.responseFileName = responseFileName;
    }

    @SimpleFunction(description = "Clears all cookies for this Web component.")
    public void ClearCookies() {
        if (this.cookieHandler != null) {
            GingerbreadUtil.clearCookies(this.cookieHandler);
        } else {
            this.form.dispatchErrorOccurredEvent(this, "ClearCookies", 4, new Object[0]);
        }
    }

    @SimpleFunction
    public void Get() {
        CapturedProperties webProps = capturePropertyValues("Get");
        if (webProps != null) {
            AsynchUtil.runAsynchronously(new C01231(webProps));
        }
    }

    @SimpleFunction(description = "Performs an HTTP POST request using the Url property and the specified text.<br>The characters of the text are encoded using UTF-8 encoding.<br>If the SaveResponse property is true, the response will be saved in a file and the GotFile event will be triggered. The responseFileName property can be used to specify the name of the file.<br>If the SaveResponse property is false, the GotText event will be triggered.")
    public void PostText(String text) {
        requestTextImpl(text, "UTF-8", "PostText", "POST");
    }

    @SimpleFunction(description = "Performs an HTTP POST request using the Url property and the specified text.<br>The characters of the text are encoded using the given encoding.<br>If the SaveResponse property is true, the response will be saved in a file and the GotFile event will be triggered. The ResponseFileName property can be used to specify the name of the file.<br>If the SaveResponse property is false, the GotText event will be triggered.")
    public void PostTextWithEncoding(String text, String encoding) {
        requestTextImpl(text, encoding, "PostTextWithEncoding", "POST");
    }

    @SimpleFunction(description = "Performs an HTTP POST request using the Url property and data from the specified file.<br>If the SaveResponse property is true, the response will be saved in a file and the GotFile event will be triggered. The ResponseFileName property can be used to specify the name of the file.<br>If the SaveResponse property is false, the GotText event will be triggered.")
    public void PostFile(String path) {
        CapturedProperties webProps = capturePropertyValues("PostFile");
        if (webProps != null) {
            AsynchUtil.runAsynchronously(new C01242(webProps, path));
        }
    }

    @SimpleFunction(description = "Performs an HTTP PUT request using the Url property and the specified text.<br>The characters of the text are encoded using UTF-8 encoding.<br>If the SaveResponse property is true, the response will be saved in a file and the GotFile event will be triggered. The responseFileName property can be used to specify the name of the file.<br>If the SaveResponse property is false, the GotText event will be triggered.")
    public void PutText(String text) {
        requestTextImpl(text, "UTF-8", "PutText", "PUT");
    }

    @SimpleFunction(description = "Performs an HTTP PUT request using the Url property and the specified text.<br>The characters of the text are encoded using the given encoding.<br>If the SaveResponse property is true, the response will be saved in a file and the GotFile event will be triggered. The ResponseFileName property can be used to specify the name of the file.<br>If the SaveResponse property is false, the GotText event will be triggered.")
    public void PutTextWithEncoding(String text, String encoding) {
        requestTextImpl(text, encoding, "PutTextWithEncoding", "PUT");
    }

    @SimpleFunction(description = "Performs an HTTP PUT request using the Url property and data from the specified file.<br>If the SaveResponse property is true, the response will be saved in a file and the GotFile event will be triggered. The ResponseFileName property can be used to specify the name of the file.<br>If the SaveResponse property is false, the GotText event will be triggered.")
    public void PutFile(String path) {
        CapturedProperties webProps = capturePropertyValues("PutFile");
        if (webProps != null) {
            AsynchUtil.runAsynchronously(new C01253(webProps, path));
        }
    }

    @SimpleFunction
    public void Delete() {
        CapturedProperties webProps = capturePropertyValues("Delete");
        if (webProps != null) {
            AsynchUtil.runAsynchronously(new C01264(webProps));
        }
    }

    private void requestTextImpl(String text, String encoding, String functionName, String httpVerb) {
        CapturedProperties webProps = capturePropertyValues(functionName);
        if (webProps != null) {
            AsynchUtil.runAsynchronously(new C01275(encoding, text, functionName, webProps, httpVerb));
        }
    }

    @SimpleEvent
    public void GotText(String url, int responseCode, String responseType, String responseContent) {
        EventDispatcher.dispatchEvent(this, "GotText", url, Integer.valueOf(responseCode), responseType, responseContent);
    }

    @SimpleEvent
    public void GotFile(String url, int responseCode, String responseType, String fileName) {
        EventDispatcher.dispatchEvent(this, "GotFile", url, Integer.valueOf(responseCode), responseType, fileName);
    }

    @SimpleFunction
    public String BuildRequestData(YailList list) {
        try {
            return buildRequestData(list);
        } catch (BuildRequestDataException e) {
            this.form.dispatchErrorOccurredEvent(this, "BuildRequestData", e.errorNumber, Integer.valueOf(e.index));
            return ElementType.MATCH_ANY_LOCALNAME;
        }
    }

    String buildRequestData(YailList list) throws BuildRequestDataException {
        StringBuilder sb = new StringBuilder();
        String delimiter = ElementType.MATCH_ANY_LOCALNAME;
        int i = 0;
        while (i < list.size()) {
            YailList item = list.getObject(i);
            if (item instanceof YailList) {
                YailList sublist = item;
                if (sublist.size() == 2) {
                    sb.append(delimiter).append(UriEncode(sublist.getObject(0).toString())).append('=').append(UriEncode(sublist.getObject(1).toString()));
                    delimiter = "&";
                    i++;
                } else {
                    throw new BuildRequestDataException(ErrorMessages.ERROR_WEB_BUILD_REQUEST_DATA_NOT_TWO_ELEMENTS, i + 1);
                }
            }
            throw new BuildRequestDataException(ErrorMessages.ERROR_WEB_BUILD_REQUEST_DATA_NOT_LIST, i + 1);
        }
        return sb.toString();
    }

    @SimpleFunction
    public String UriEncode(String text) {
        try {
            return URLEncoder.encode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(LOG_TAG, "UTF-8 is unsupported?", e);
            return ElementType.MATCH_ANY_LOCALNAME;
        }
    }

    @SimpleFunction
    public Object JsonTextDecode(String jsonText) {
        try {
            return decodeJsonText(jsonText);
        } catch (IllegalArgumentException e) {
            this.form.dispatchErrorOccurredEvent(this, "JsonTextDecode", ErrorMessages.ERROR_WEB_JSON_TEXT_DECODE_FAILED, jsonText);
            return ElementType.MATCH_ANY_LOCALNAME;
        }
    }

    static Object decodeJsonText(String jsonText) throws IllegalArgumentException {
        try {
            return JsonUtil.getObjectFromJson(jsonText);
        } catch (JSONException e) {
            throw new IllegalArgumentException("jsonText is not a legal JSON value");
        }
    }

    @SimpleFunction(description = "Decodes the given XML string to produce a list structure.  See the App Inventor documentation on \"Other topics, notes, and details\" for information.")
    public Object XMLTextDecode(String XmlText) {
        try {
            return JsonTextDecode(XML.toJSONObject(XmlText).toString());
        } catch (JSONException e) {
            Log.e("Exception in XMLTextDecode", e.getMessage());
            this.form.dispatchErrorOccurredEvent(this, "XMLTextDecode", ErrorMessages.ERROR_WEB_JSON_TEXT_DECODE_FAILED, e.getMessage());
            return YailList.makeEmptyList();
        }
    }

    @SimpleFunction(description = "Decodes the given HTML text value. HTML character entities such as &amp;amp;, &amp;lt;, &amp;gt;, &amp;apos;, and &amp;quot; are changed to &amp;, &lt;, &gt;, &#39;, and &quot;. Entities such as &amp;#xhhhh, and &amp;#nnnn are changed to the appropriate characters.")
    public String HtmlTextDecode(String htmlText) {
        try {
            return HtmlEntities.decodeHtmlText(htmlText);
        } catch (IllegalArgumentException e) {
            this.form.dispatchErrorOccurredEvent(this, "HtmlTextDecode", ErrorMessages.ERROR_WEB_HTML_TEXT_DECODE_FAILED, htmlText);
            return ElementType.MATCH_ANY_LOCALNAME;
        }
    }

    private void performRequest(CapturedProperties webProps, byte[] postData, String postFile, String httpVerb) throws IOException {
        HttpURLConnection connection = openConnection(webProps, httpVerb);
        if (connection != null) {
            if (postData != null) {
                try {
                    writeRequestData(connection, postData);
                } catch (Throwable th) {
                    connection.disconnect();
                }
            } else if (postFile != null) {
                writeRequestFile(connection, postFile);
            }
            int responseCode = connection.getResponseCode();
            String responseType = getResponseType(connection);
            processResponseCookies(connection);
            if (this.saveResponse) {
                this.activity.runOnUiThread(new C01286(webProps, responseCode, responseType, saveResponseContent(connection, webProps.responseFileName, responseType)));
            } else {
                this.activity.runOnUiThread(new C01297(webProps, responseCode, responseType, getResponseContent(connection)));
            }
            connection.disconnect();
        }
    }

    private static HttpURLConnection openConnection(CapturedProperties webProps, String httpVerb) throws IOException, ClassCastException, ProtocolException {
        HttpURLConnection connection = (HttpURLConnection) webProps.url.openConnection();
        if (httpVerb.equals("PUT") || httpVerb.equals("DELETE")) {
            connection.setRequestMethod(httpVerb);
        }
        for (Entry<String, List<String>> header : webProps.requestHeaders.entrySet()) {
            String name = (String) header.getKey();
            for (String value : (List) header.getValue()) {
                connection.addRequestProperty(name, value);
            }
        }
        if (webProps.cookies != null) {
            for (Entry<String, List<String>> cookie : webProps.cookies.entrySet()) {
                name = (String) cookie.getKey();
                for (String value2 : (List) cookie.getValue()) {
                    connection.addRequestProperty(name, value2);
                }
            }
        }
        return connection;
    }

    private static void writeRequestData(HttpURLConnection connection, byte[] postData) throws IOException {
        connection.setDoOutput(true);
        connection.setFixedLengthStreamingMode(postData.length);
        BufferedOutputStream out = new BufferedOutputStream(connection.getOutputStream());
        try {
            out.write(postData, 0, postData.length);
            out.flush();
        } finally {
            out.close();
        }
    }

    private void writeRequestFile(HttpURLConnection connection, String path) throws IOException {
        BufferedInputStream in = new BufferedInputStream(MediaUtil.openMedia(this.form, path));
        BufferedOutputStream out;
        try {
            connection.setDoOutput(true);
            connection.setChunkedStreamingMode(0);
            out = new BufferedOutputStream(connection.getOutputStream());
            while (true) {
                int b = in.read();
                if (b == -1) {
                    out.flush();
                    out.close();
                    in.close();
                    return;
                }
                out.write(b);
            }
        } catch (Throwable th) {
            in.close();
        }
    }

    private static String getResponseType(HttpURLConnection connection) {
        String responseType = connection.getContentType();
        return responseType != null ? responseType : ElementType.MATCH_ANY_LOCALNAME;
    }

    private void processResponseCookies(HttpURLConnection connection) {
        if (this.allowCookies && this.cookieHandler != null) {
            try {
                this.cookieHandler.put(connection.getURL().toURI(), connection.getHeaderFields());
            } catch (URISyntaxException e) {
            } catch (IOException e2) {
            }
        }
    }

    private static String getResponseContent(HttpURLConnection connection) throws IOException {
        String encoding = connection.getContentEncoding();
        if (encoding == null) {
            encoding = "UTF-8";
        }
        InputStreamReader reader = new InputStreamReader(getConnectionStream(connection), encoding);
        try {
            int contentLength = connection.getContentLength();
            StringBuilder sb = contentLength != -1 ? new StringBuilder(contentLength) : new StringBuilder();
            char[] buf = new char[LambdaExp.SEQUENCE_RESULT];
            while (true) {
                int read = reader.read(buf);
                if (read == -1) {
                    break;
                }
                sb.append(buf, 0, read);
            }
            String stringBuilder = sb.toString();
            return stringBuilder;
        } finally {
            reader.close();
        }
    }

    private static String saveResponseContent(HttpURLConnection connection, String responseFileName, String responseType) throws IOException {
        File file = createFile(responseFileName, responseType);
        BufferedInputStream in = new BufferedInputStream(getConnectionStream(connection), LambdaExp.ATTEMPT_INLINE);
        BufferedOutputStream out;
        try {
            out = new BufferedOutputStream(new FileOutputStream(file), LambdaExp.ATTEMPT_INLINE);
            while (true) {
                int b = in.read();
                if (b == -1) {
                    out.flush();
                    out.close();
                    in.close();
                    return file.getAbsolutePath();
                }
                out.write(b);
            }
        } catch (Throwable th) {
            in.close();
        }
    }

    private static InputStream getConnectionStream(HttpURLConnection connection) {
        try {
            return connection.getInputStream();
        } catch (IOException e) {
            return connection.getErrorStream();
        }
    }

    private static File createFile(String fileName, String responseType) throws IOException, FileException {
        if (!TextUtils.isEmpty(fileName)) {
            return FileUtil.getExternalFile(fileName);
        }
        int indexOfSemicolon = responseType.indexOf(59);
        if (indexOfSemicolon != -1) {
            responseType = responseType.substring(0, indexOfSemicolon);
        }
        String extension = (String) mimeTypeToExtension.get(responseType);
        if (extension == null) {
            extension = "tmp";
        }
        return FileUtil.getDownloadFile(extension);
    }

    private static Map<String, List<String>> processRequestHeaders(YailList list) throws InvalidRequestHeadersException {
        Map<String, List<String>> requestHeadersMap = Maps.newHashMap();
        int i = 0;
        while (i < list.size()) {
            YailList item = list.getObject(i);
            if (item instanceof YailList) {
                YailList sublist = item;
                if (sublist.size() == 2) {
                    String fieldName = sublist.getObject(0).toString();
                    YailList fieldValues = sublist.getObject(1);
                    String key = fieldName;
                    List<String> values = Lists.newArrayList();
                    if (fieldValues instanceof YailList) {
                        YailList multipleFieldsValues = fieldValues;
                        for (int j = 0; j < multipleFieldsValues.size(); j++) {
                            values.add(multipleFieldsValues.getObject(j).toString());
                        }
                    } else {
                        values.add(fieldValues.toString());
                    }
                    requestHeadersMap.put(key, values);
                    i++;
                } else {
                    throw new InvalidRequestHeadersException(ErrorMessages.ERROR_WEB_REQUEST_HEADER_NOT_TWO_ELEMENTS, i + 1);
                }
            }
            throw new InvalidRequestHeadersException(ErrorMessages.ERROR_WEB_REQUEST_HEADER_NOT_LIST, i + 1);
        }
        return requestHeadersMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.appinventor.components.runtime.Web.CapturedProperties capturePropertyValues(java.lang.String r7) {
        /*
        r6 = this;
        r3 = 1;
        r5 = 0;
        r1 = new com.google.appinventor.components.runtime.Web$CapturedProperties;	 Catch:{ MalformedURLException -> 0x0008, InvalidRequestHeadersException -> 0x0018 }
        r1.<init>(r6);	 Catch:{ MalformedURLException -> 0x0008, InvalidRequestHeadersException -> 0x0018 }
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = move-exception;
        r1 = r6.form;
        r2 = 1109; // 0x455 float:1.554E-42 double:5.48E-321;
        r3 = new java.lang.Object[r3];
        r4 = r6.urlString;
        r3[r5] = r4;
        r1.dispatchErrorOccurredEvent(r6, r7, r2, r3);
    L_0x0016:
        r1 = 0;
        goto L_0x0007;
    L_0x0018:
        r0 = move-exception;
        r1 = r6.form;
        r2 = r0.errorNumber;
        r3 = new java.lang.Object[r3];
        r4 = r0.index;
        r4 = java.lang.Integer.valueOf(r4);
        r3[r5] = r4;
        r1.dispatchErrorOccurredEvent(r6, r7, r2, r3);
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.appinventor.components.runtime.Web.capturePropertyValues(java.lang.String):com.google.appinventor.components.runtime.Web$CapturedProperties");
    }
}
