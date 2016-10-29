package appinventor.ai_mathew_mullen_mechtly.CodeForGood;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Camera;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.DatePicker;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.File;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.TextBox;
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

/* compiled from: more_info.yail */
public class more_info extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final FString Lit10;
    static final SimpleSymbol Lit100;
    static final SimpleSymbol Lit101;
    static final SimpleSymbol Lit102;
    static final SimpleSymbol Lit103;
    static final SimpleSymbol Lit104;
    static final SimpleSymbol Lit105;
    static final SimpleSymbol Lit106;
    static final SimpleSymbol Lit107;
    static final SimpleSymbol Lit108;
    static final SimpleSymbol Lit109;
    static final SimpleSymbol Lit11;
    static final FString Lit12;
    static final FString Lit13;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15;
    static final IntNum Lit16;
    static final SimpleSymbol Lit17;
    static final FString Lit18;
    static final FString Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final IntNum Lit23;
    static final FString Lit24;
    static final SimpleSymbol Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final PairWithPosition Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final SimpleSymbol Lit30;
    static final FString Lit31;
    static final SimpleSymbol Lit32;
    static final FString Lit33;
    static final FString Lit34;
    static final SimpleSymbol Lit35;
    static final SimpleSymbol Lit36;
    static final IntNum Lit37;
    static final SimpleSymbol Lit38;
    static final FString Lit39;
    static final SimpleSymbol Lit4;
    static final FString Lit40;
    static final SimpleSymbol Lit41;
    static final FString Lit42;
    static final PairWithPosition Lit43;
    static final SimpleSymbol Lit44;
    static final FString Lit45;
    static final SimpleSymbol Lit46;
    static final FString Lit47;
    static final FString Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final FString Lit51;
    static final SimpleSymbol Lit52;
    static final FString Lit53;
    static final SimpleSymbol Lit54;
    static final PairWithPosition Lit55;
    static final PairWithPosition Lit56;
    static final SimpleSymbol Lit57;
    static final PairWithPosition Lit58;
    static final PairWithPosition Lit59;
    static final IntNum Lit6;
    static final SimpleSymbol Lit60;
    static final PairWithPosition Lit61;
    static final SimpleSymbol Lit62;
    static final SimpleSymbol Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final FString Lit67;
    static final SimpleSymbol Lit68;
    static final FString Lit69;
    static final SimpleSymbol Lit7;
    static final FString Lit70;
    static final SimpleSymbol Lit71;
    static final SimpleSymbol Lit72;
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final FString Lit75;
    static final FString Lit76;
    static final SimpleSymbol Lit77;
    static final FString Lit78;
    static final FString Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final FString Lit81;
    static final SimpleSymbol Lit82;
    static final SimpleSymbol Lit83;
    static final SimpleSymbol Lit84;
    static final SimpleSymbol Lit85;
    static final FString Lit86;
    static final SimpleSymbol Lit87;
    static final FString Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final SimpleSymbol Lit90;
    static final FString Lit91;
    static final PairWithPosition Lit92;
    static final SimpleSymbol Lit93;
    static final FString Lit94;
    static final FString Lit95;
    static final FString Lit96;
    static final FString Lit97;
    static final SimpleSymbol Lit98;
    static final SimpleSymbol Lit99;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public static more_info more_info;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Camera Camera1;
    public DatePicker DatePicker1;
    public final ModuleMethod DatePicker1$AfterDateSet;
    public File File1;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public HorizontalArrangement HorizontalArrangement4;
    public HorizontalArrangement HorizontalArrangement5;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public ListPicker ListPicker1;
    public final ModuleMethod ListPicker1$AfterPicking;
    public ListPicker ListPicker2;
    public final ModuleMethod ListPicker2$AfterPicking;
    public TextBox TextBox1;
    public VerticalArrangement VerticalArrangement1;
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
    public Button nextScreen;
    public final ModuleMethod nextScreen$Click;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: more_info.yail */
    public class frame extends ModuleBody {
        more_info $main;

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
                    if (!(obj instanceof more_info)) {
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
                    if (!(obj instanceof more_info)) {
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
                    return more_info.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return more_info.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return more_info.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return more_info.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return more_info.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return more_info.lambda7();
                case Sequence.INT_S32_VALUE /*22*/:
                    return this.$main.ListPicker1$AfterPicking();
                case Sequence.INT_U64_VALUE /*23*/:
                    return more_info.lambda8();
                case Sequence.INT_S64_VALUE /*24*/:
                    return more_info.lambda9();
                case Sequence.FLOAT_VALUE /*25*/:
                    return more_info.lambda10();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return more_info.lambda11();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return this.$main.ListPicker2$AfterPicking();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return more_info.lambda12();
                case Sequence.CHAR_VALUE /*29*/:
                    return more_info.lambda13();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return more_info.lambda14();
                case Sequence.CDATA_VALUE /*31*/:
                    return more_info.lambda15();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return this.$main.DatePicker1$AfterDateSet();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return more_info.lambda16();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return more_info.lambda17();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return more_info.lambda18();
                case Sequence.COMMENT_VALUE /*36*/:
                    return more_info.lambda19();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return more_info.lambda20();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return more_info.lambda21();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return this.$main.Button1$Click();
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    return more_info.lambda22();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return more_info.lambda23();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return this.$main.nextScreen$Click();
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
                case Sequence.FLOAT_VALUE /*25*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOUBLE_VALUE /*26*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.BOOLEAN_VALUE /*27*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CHAR_VALUE /*29*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.CDATA_VALUE /*31*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case SetExp.SET_IF_UNBOUND /*32*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ELEMENT_VALUE /*33*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.DOCUMENT_VALUE /*34*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.COMMENT_VALUE /*36*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.STRING_TYPE_CODE /*38*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit109 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit108 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit107 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit106 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit105 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit104 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit103 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit102 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit101 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit100 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit98 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit97 = new FString("com.google.appinventor.components.runtime.Camera");
        Lit96 = new FString("com.google.appinventor.components.runtime.Camera");
        Lit95 = new FString("com.google.appinventor.components.runtime.File");
        Lit94 = new FString("com.google.appinventor.components.runtime.File");
        Lit93 = (SimpleSymbol) new SimpleSymbol("nextScreen$Click").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit92 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 626767);
        Lit91 = new FString("com.google.appinventor.components.runtime.Button");
        Lit90 = (SimpleSymbol) new SimpleSymbol("nextScreen").readResolve();
        Lit89 = new FString("com.google.appinventor.components.runtime.Button");
        Lit88 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit87 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit86 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit85 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit84 = (SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve();
        Lit83 = (SimpleSymbol) new SimpleSymbol("TakePicture").readResolve();
        Lit82 = (SimpleSymbol) new SimpleSymbol("Camera1").readResolve();
        Lit81 = new FString("com.google.appinventor.components.runtime.Button");
        Lit80 = (SimpleSymbol) new SimpleSymbol("Button1").readResolve();
        Lit79 = new FString("com.google.appinventor.components.runtime.Button");
        Lit78 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit77 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement5").readResolve();
        Lit76 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit75 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit74 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit73 = (SimpleSymbol) new SimpleSymbol("NumbersOnly").readResolve();
        Lit72 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit71 = (SimpleSymbol) new SimpleSymbol("TextBox1").readResolve();
        Lit70 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit69 = new FString("com.google.appinventor.components.runtime.Label");
        Lit68 = (SimpleSymbol) new SimpleSymbol("Label4").readResolve();
        Lit67 = new FString("com.google.appinventor.components.runtime.Label");
        Lit66 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit65 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement4").readResolve();
        Lit64 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit63 = (SimpleSymbol) new SimpleSymbol("AfterDateSet").readResolve();
        Lit62 = (SimpleSymbol) new SimpleSymbol("DatePicker1$AfterDateSet").readResolve();
        Lit61 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 402027), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 402021);
        Lit60 = (SimpleSymbol) new SimpleSymbol("Year").readResolve();
        Lit59 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 401891), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 401885);
        Lit58 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 401785), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 401779);
        Lit57 = (SimpleSymbol) new SimpleSymbol("Day").readResolve();
        Lit56 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 401650), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 401644);
        Lit55 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 401544), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 401538);
        Lit54 = (SimpleSymbol) new SimpleSymbol("Month").readResolve();
        Lit53 = new FString("com.google.appinventor.components.runtime.DatePicker");
        Lit52 = (SimpleSymbol) new SimpleSymbol("DatePicker1").readResolve();
        Lit51 = new FString("com.google.appinventor.components.runtime.DatePicker");
        Lit50 = new FString("com.google.appinventor.components.runtime.Label");
        Lit49 = (SimpleSymbol) new SimpleSymbol("Label3").readResolve();
        Lit48 = new FString("com.google.appinventor.components.runtime.Label");
        Lit47 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit46 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit45 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit44 = (SimpleSymbol) new SimpleSymbol("ListPicker2$AfterPicking").readResolve();
        Lit43 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 299148), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 299142);
        Lit42 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit41 = (SimpleSymbol) new SimpleSymbol("ListPicker2").readResolve();
        Lit40 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit39 = new FString("com.google.appinventor.components.runtime.Label");
        Lit38 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit37 = IntNum.make(-2);
        Lit36 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit35 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit34 = new FString("com.google.appinventor.components.runtime.Label");
        Lit33 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit32 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit31 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit30 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit29 = (SimpleSymbol) new SimpleSymbol("ListPicker1$AfterPicking").readResolve();
        Lit28 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 172172), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/more_info.yail", 172166);
        Lit27 = (SimpleSymbol) new SimpleSymbol("Selection").readResolve();
        Lit26 = (SimpleSymbol) new SimpleSymbol("AppendToFile").readResolve();
        Lit25 = (SimpleSymbol) new SimpleSymbol("File1").readResolve();
        Lit24 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit23 = IntNum.make(2);
        Lit22 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit21 = (SimpleSymbol) new SimpleSymbol("ElementsFromString").readResolve();
        Lit20 = (SimpleSymbol) new SimpleSymbol("ListPicker1").readResolve();
        Lit19 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit18 = new FString("com.google.appinventor.components.runtime.Label");
        Lit17 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit16 = IntNum.make(16);
        Lit15 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit13 = new FString("com.google.appinventor.components.runtime.Label");
        Lit12 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit11 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit10 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit9 = (SimpleSymbol) new SimpleSymbol("Title").readResolve();
        Lit8 = (SimpleSymbol) new SimpleSymbol("Sizing").readResolve();
        Lit7 = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        int[] iArr = new int[2];
        iArr[0] = Component.COLOR_CYAN;
        Lit6 = IntNum.make(iArr);
        Lit5 = (SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve();
        Lit3 = (SimpleSymbol) new SimpleSymbol("AppName").readResolve();
        Lit2 = (SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve();
        Lit1 = (SimpleSymbol) new SimpleSymbol("getMessage").readResolve();
        Lit0 = (SimpleSymbol) new SimpleSymbol("more_info").readResolve();
    }

    public more_info() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame = new frame();
        appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 1, Lit98, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 2, Lit99, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 3, Lit100, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 5, Lit101, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 6, Lit102, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 7, Lit103, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 8, Lit104, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 9, Lit105, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 10, Lit106, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 11, Lit107, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 13, Lit108, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 14, Lit109, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3960804766349238341.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 21, null, 0);
        this.ListPicker1$AfterPicking = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 22, Lit29, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 26, null, 0);
        this.ListPicker2$AfterPicking = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 27, Lit44, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 28, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 29, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 31, null, 0);
        this.DatePicker1$AfterDateSet = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 32, Lit62, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 34, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 35, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 36, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 37, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 38, null, 0);
        this.Button1$Click = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 39, Lit84, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 40, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 41, null, 0);
        this.nextScreen$Click = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_more_info_frame, 42, Lit93, 0);
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
            more_info = null;
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
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Area Information", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit10, Lit11, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit12, Lit11, Boolean.FALSE);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit13, Lit14, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit11, Lit18, Lit14, lambda$Fn4);
                }
                this.ListPicker1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit19, Lit20, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit11, Lit24, Lit20, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit29, this.ListPicker1$AfterPicking);
                } else {
                    addToFormEnvironment(Lit29, this.ListPicker1$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "AfterPicking");
                } else {
                    addToEvents(Lit20, Lit30);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit31, Lit32, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit33, Lit32, Boolean.FALSE);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit32, Lit34, Lit35, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit32, Lit39, Lit35, lambda$Fn8);
                }
                this.ListPicker2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit32, Lit40, Lit41, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit32, Lit42, Lit41, lambda$Fn10);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit44, this.ListPicker2$AfterPicking);
                } else {
                    addToFormEnvironment(Lit44, this.ListPicker2$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker2", "AfterPicking");
                } else {
                    addToEvents(Lit41, Lit30);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit45, Lit46, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit47, Lit46, Boolean.FALSE);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit46, Lit48, Lit49, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit46, Lit50, Lit49, lambda$Fn12);
                }
                this.DatePicker1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit46, Lit51, Lit52, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit46, Lit53, Lit52, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit62, this.DatePicker1$AfterDateSet);
                } else {
                    addToFormEnvironment(Lit62, this.DatePicker1$AfterDateSet);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "DatePicker1", "AfterDateSet");
                } else {
                    addToEvents(Lit52, Lit63);
                }
                this.HorizontalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit64, Lit65, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit66, Lit65, Boolean.FALSE);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit67, Lit68, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit65, Lit69, Lit68, lambda$Fn16);
                }
                this.TextBox1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit70, Lit71, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit65, Lit75, Lit71, lambda$Fn18);
                }
                this.HorizontalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit76, Lit77, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit78, Lit77, Boolean.FALSE);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit77, Lit79, Lit80, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit77, Lit81, Lit80, lambda$Fn20);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit84, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit84, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit80, Lit85);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit87, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit88, Lit87, Boolean.FALSE);
                }
                this.nextScreen = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit89, Lit90, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit0, Lit91, Lit90, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit93, this.nextScreen$Click);
                } else {
                    addToFormEnvironment(Lit93, this.nextScreen$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "nextScreen", "Click");
                } else {
                    addToEvents(Lit90, Lit85);
                }
                this.File1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit94, Lit25, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit95, Lit25, Boolean.FALSE);
                }
                this.Camera1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit96, Lit82, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit97, Lit82, Boolean.FALSE);
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
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "Area Information", Lit4);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit15, Lit16, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit17, "Village/Settlement:", Lit4);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit15, Lit16, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit17, "Village/Settlement:", Lit4);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "village1,village2,village3,village4", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit17, "Choose One...", Lit4);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "village1,village2,village3,village4", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit17, "Choose One...", Lit4);
    }

    public Object ListPicker1$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit25, Lit26, LList.list2(runtime.getProperty$1(Lit20, Lit27), "/screen2-choices.txt"), Lit28);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit35, Lit15, Lit16, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit35, Lit36, Lit37, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit35, Lit38, Lit37, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit35, Lit17, "District/Local Admin. Area:", Lit4);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit35, Lit15, Lit16, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit35, Lit36, Lit37, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit35, Lit38, Lit37, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit35, Lit17, "District/Local Admin. Area:", Lit4);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit21, "district1,district2,district3,district4", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit17, "Choose One...", Lit4);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit41, Lit21, "district1,district2,district3,district4", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit41, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit17, "Choose One...", Lit4);
    }

    public Object ListPicker2$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit25, Lit26, LList.list2(runtime.getProperty$1(Lit41, Lit27), "/screen2-choices.txt"), Lit43);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit15, Lit16, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit17, "Date Assessment Completed:", Lit4);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit15, Lit16, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit17, "Date Assessment Completed:", Lit4);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit17, "Choose Date", Lit4);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit52, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit52, Lit17, "Choose Date", Lit4);
    }

    public Object DatePicker1$AfterDateSet() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit25, Lit26, LList.list2(runtime.getProperty$1(Lit52, Lit54), "/screen2-choices.txt"), Lit55);
        runtime.callComponentMethod(Lit25, Lit26, LList.list2("/", "/screen2-choices.txt"), Lit56);
        runtime.callComponentMethod(Lit25, Lit26, LList.list2(runtime.getProperty$1(Lit52, Lit57), "/screen2-choices.txt"), Lit58);
        runtime.callComponentMethod(Lit25, Lit26, LList.list2("/", "/screen2-choices.txt"), Lit59);
        return runtime.callComponentMethod(Lit25, Lit26, LList.list2(runtime.getProperty$1(Lit52, Lit60), "/screen2-choices.txt"), Lit61);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit15, Lit16, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit17, "Estimated Area Population:", Lit4);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit68, Lit15, Lit16, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit17, "Estimated Area Population:", Lit4);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit72, "Enter Population", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit73, Boolean.TRUE, Lit74);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit71, Lit72, "Enter Population", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit71, Lit73, Boolean.TRUE, Lit74);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit17, "Take Area Photo", Lit4);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit80, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit17, "Take Area Photo", Lit4);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit82, Lit83, LList.Empty, LList.Empty);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit17, "Data Sheet A", Lit4);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit90, Lit22, Lit23, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit90, Lit17, "Data Sheet A", Lit4);
    }

    public Object nextScreen$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("A_Screen"), Lit92, "open another screen");
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
        more_info = this;
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
        more_info closureEnv = this;
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
