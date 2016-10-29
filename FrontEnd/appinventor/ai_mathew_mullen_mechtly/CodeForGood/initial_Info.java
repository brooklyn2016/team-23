package appinventor.ai_mathew_mullen_mechtly.CodeForGood;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.expr.SetExp;
import gnu.kawa.functions.ArithOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.ParseFormat;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.kawa.xml.XDataType;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.Sequence;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: initial_Info.yail */
public class initial_Info extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final FString Lit10;
    static final SimpleSymbol Lit11;
    static final FString Lit12;
    static final FString Lit13;
    static final SimpleSymbol Lit14;
    static final FString Lit15;
    static final FString Lit16;
    static final SimpleSymbol Lit17;
    static final FString Lit18;
    static final FString Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final FString Lit22;
    static final FString Lit23;
    static final SimpleSymbol Lit24;
    static final FString Lit25;
    static final FString Lit26;
    static final SimpleSymbol Lit27;
    static final FString Lit28;
    static final FString Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final FString Lit31;
    static final FString Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final FString Lit35;
    static final SimpleSymbol Lit36;
    static final SimpleSymbol Lit37;
    static final PairWithPosition Lit38;
    static final PairWithPosition Lit39;
    static final SimpleSymbol Lit4;
    static final PairWithPosition Lit40;
    static final SimpleSymbol Lit41;
    static final SimpleSymbol Lit42;
    static final FString Lit43;
    static final FString Lit44;
    static final SimpleSymbol Lit45;
    static final SimpleSymbol Lit46;
    static final SimpleSymbol Lit47;
    static final SimpleSymbol Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final SimpleSymbol Lit51;
    static final SimpleSymbol Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final SimpleSymbol Lit56;
    static final SimpleSymbol Lit57;
    static final IntNum Lit6;
    static final SimpleSymbol Lit7;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit9;
    public static initial_Info initial_Info;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public TinyDB TinyDB1;
    public VerticalArrangement VerticalArrangement1;
    public VerticalArrangement VerticalArrangement2;
    public VerticalArrangement VerticalArrangement3;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public PasswordTextBox password;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    public TextBox userName;

    /* compiled from: initial_Info.yail */
    public class frame extends ModuleBody {
        initial_Info $main;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_LEFT /*10*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    if (!(obj instanceof initial_Info)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT /*6*/:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case ArithOp.IOR /*14*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case ArithOp.AND /*13*/:
                    if (!(obj instanceof initial_Info)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case ParseFormat.SEEN_MINUS /*1*/:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.DIVIDE_INEXACT /*5*/:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case ArithOp.ASHIFT_LEFT /*10*/:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case ArithOp.ASHIFT_RIGHT /*11*/:
                    this.$main.sendError(obj);
                    return Values.empty;
                case ArithOp.LSHIFT_RIGHT /*12*/:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case SetExp.PREFER_BINDING2 /*8*/:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case ArithOp.AND /*13*/:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case SetExp.DEFINING_FLAG /*2*/:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT /*6*/:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case ArithOp.QUOTIENT_EXACT /*7*/:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case ArithOp.ASHIFT_GENERAL /*9*/:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case ArithOp.IOR /*14*/:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    return initial_Info.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return initial_Info.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return initial_Info.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return initial_Info.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return initial_Info.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return initial_Info.lambda7();
                case Sequence.INT_S32_VALUE /*22*/:
                    return initial_Info.lambda8();
                case Sequence.INT_U64_VALUE /*23*/:
                    return initial_Info.lambda9();
                case Sequence.INT_S64_VALUE /*24*/:
                    return this.$main.Button1$Click();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case ArithOp.XOR /*15*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.PROCEDURE /*16*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U8_VALUE /*17*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S8_VALUE /*18*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U16_VALUE /*19*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S16_VALUE /*20*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U32_VALUE /*21*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S32_VALUE /*22*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_U64_VALUE /*23*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.INT_S64_VALUE /*24*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit57 = (SimpleSymbol) new SimpleSymbol("any").readResolve();
        Lit56 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit55 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit54 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit53 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit52 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit51 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit50 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit48 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit47 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit46 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit45 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit44 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit43 = new FString("com.google.appinventor.components.runtime.TinyDB");
        Lit42 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit41 = (SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit40 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/initial_Info.yail", 258365);
        Lit39 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/initial_Info.yail", 258285), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/initial_Info.yail", 258279);
        Lit38 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit57, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/initial_Info.yail", 258165), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/initial_Info.yail", 258159);
        Lit37 = (SimpleSymbol) new SimpleSymbol("StoreValue").readResolve();
        Lit36 = (SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve();
        Lit35 = new FString("com.google.appinventor.components.runtime.Button");
        Lit34 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("Button1").readResolve();
        Lit32 = new FString("com.google.appinventor.components.runtime.Button");
        Lit31 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
        Lit30 = (SimpleSymbol) new SimpleSymbol("password").readResolve();
        Lit29 = new FString("com.google.appinventor.components.runtime.PasswordTextBox");
        Lit28 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit27 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement3").readResolve();
        Lit26 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit25 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit24 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit23 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit22 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit21 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit20 = (SimpleSymbol) new SimpleSymbol("userName").readResolve();
        Lit19 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit18 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit17 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement2").readResolve();
        Lit16 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit15 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit14 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit13 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit12 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit11 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit10 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit9 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit6 = IntNum.make(iArr);
        Lit5 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("initial_Info").readResolve();
    }

    public initial_Info() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame = new frame();
        appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 1, Lit45, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 2, Lit46, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 3, Lit47, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 5, Lit48, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 6, Lit49, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 7, Lit50, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 8, Lit51, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 9, Lit52, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 10, Lit53, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 11, Lit54, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 13, Lit55, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 14, Lit56, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3960804766349238341.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 21, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 22, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 23, null, 0);
        this.Button1$Click = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_initial_Info_frame, 24, Lit41, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            initial_Info = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "CodeForGood", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Responsive", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Login", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit10, Lit11, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit12, Lit11, Boolean.FALSE);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit13, Lit14, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit11, Lit15, Lit14, Boolean.FALSE);
                }
                this.VerticalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit14, Lit16, Lit17, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit14, Lit18, Lit17, Boolean.FALSE);
                }
                this.userName = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit17, Lit19, Lit20, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit17, Lit22, Lit20, lambda$Fn4);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit23, Lit24, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit25, Lit24, Boolean.FALSE);
                }
                this.VerticalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit24, Lit26, Lit27, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit24, Lit28, Lit27, Boolean.FALSE);
                }
                this.password = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit29, Lit30, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit27, Lit31, Lit30, lambda$Fn6);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit32, Lit33, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit35, Lit33, lambda$Fn8);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit41, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit41, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit33, Lit42);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit43, Lit36, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit44, Lit36, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "CodeForGood", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, "Responsive", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Login", Lit4);
    }

    static Object lambda4() {
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "Enter username", Lit4);
    }

    static Object lambda5() {
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "Enter username", Lit4);
    }

    static Object lambda6() {
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit21, "Enter password", Lit4);
    }

    static Object lambda7() {
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit21, "Enter password", Lit4);
    }

    static Object lambda8() {
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit34, "Submit", Lit4);
    }

    static Object lambda9() {
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit34, "Submit", Lit4);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit36, Lit37, LList.list2("uName", runtime.getProperty$1(Lit20, Lit34)), Lit38);
        runtime.callComponentMethod(Lit36, Lit37, LList.list2("password", runtime.getProperty$1(Lit30, Lit34)), Lit39);
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("more_info"), Lit40, "open another screen");
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        initial_Info = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        initial_Info closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
