package appinventor.ai_mathew_mullen_mechtly.CodeForGood;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
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

/* compiled from: A_Screen.yail */
public class A_Screen extends Form implements Runnable {
    public static A_Screen A_Screen;
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
    static final SimpleSymbol Lit11;
    static final FString Lit12;
    static final FString Lit13;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15;
    static final IntNum Lit16;
    static final SimpleSymbol Lit17;
    static final IntNum Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final FString Lit21;
    static final FString Lit22;
    static final SimpleSymbol Lit23;
    static final FString Lit24;
    static final FString Lit25;
    static final SimpleSymbol Lit26;
    static final FString Lit27;
    static final FString Lit28;
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final FString Lit30;
    static final FString Lit31;
    static final SimpleSymbol Lit32;
    static final SimpleSymbol Lit33;
    static final SimpleSymbol Lit34;
    static final IntNum Lit35;
    static final FString Lit36;
    static final SimpleSymbol Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final PairWithPosition Lit40;
    static final SimpleSymbol Lit41;
    static final SimpleSymbol Lit42;
    static final FString Lit43;
    static final SimpleSymbol Lit44;
    static final IntNum Lit45;
    static final FString Lit46;
    static final FString Lit47;
    static final SimpleSymbol Lit48;
    static final SimpleSymbol Lit49;
    static final SimpleSymbol Lit5;
    static final SimpleSymbol Lit50;
    static final SimpleSymbol Lit51;
    static final FString Lit52;
    static final FString Lit53;
    static final SimpleSymbol Lit54;
    static final FString Lit55;
    static final FString Lit56;
    static final SimpleSymbol Lit57;
    static final FString Lit58;
    static final FString Lit59;
    static final IntNum Lit6;
    static final SimpleSymbol Lit60;
    static final FString Lit61;
    static final PairWithPosition Lit62;
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
    static final FString Lit72;
    static final FString Lit73;
    static final SimpleSymbol Lit74;
    static final FString Lit75;
    static final FString Lit76;
    static final SimpleSymbol Lit77;
    static final FString Lit78;
    static final PairWithPosition Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final FString Lit81;
    static final SimpleSymbol Lit82;
    static final FString Lit83;
    static final FString Lit84;
    static final SimpleSymbol Lit85;
    static final FString Lit86;
    static final FString Lit87;
    static final SimpleSymbol Lit88;
    static final FString Lit89;
    static final SimpleSymbol Lit9;
    static final PairWithPosition Lit90;
    static final SimpleSymbol Lit91;
    static final SimpleSymbol Lit92;
    static final FString Lit93;
    static final FString Lit94;
    static final SimpleSymbol Lit95;
    static final SimpleSymbol Lit96;
    static final SimpleSymbol Lit97;
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
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public File File1;
    public HorizontalArrangement HorizontalArrangement1;
    public HorizontalArrangement HorizontalArrangement2;
    public HorizontalArrangement HorizontalArrangement3;
    public Label Label1;
    public Label Label2;
    public Label Label3;
    public Label Label4;
    public ListPicker ListPicker1;
    public final ModuleMethod ListPicker1$AfterPicking;
    public ListPicker ListPicker2;
    public final ModuleMethod ListPicker2$AfterPicking;
    public ListPicker ListPicker3;
    public final ModuleMethod ListPicker3$AfterPicking;
    public TextBox TextBox1;
    public TextBox TextBox2;
    public TextBox TextBox3;
    public VerticalArrangement VerticalArrangement1;
    public VerticalArrangement VerticalArrangement2;
    public VerticalArrangement VerticalArrangement3;
    public VerticalArrangement VerticalArrangement4;
    public VerticalArrangement VerticalArrangement5;
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
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: A_Screen.yail */
    public class frame extends ModuleBody {
        A_Screen $main;

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
                    if (!(obj instanceof A_Screen)) {
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
                    if (!(obj instanceof A_Screen)) {
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
                    return A_Screen.lambda2();
                case SetExp.PROCEDURE /*16*/:
                    this.$main.$define();
                    return Values.empty;
                case Sequence.INT_U8_VALUE /*17*/:
                    return A_Screen.lambda3();
                case Sequence.INT_S8_VALUE /*18*/:
                    return A_Screen.lambda4();
                case Sequence.INT_U16_VALUE /*19*/:
                    return A_Screen.lambda5();
                case Sequence.INT_S16_VALUE /*20*/:
                    return A_Screen.lambda6();
                case Sequence.INT_U32_VALUE /*21*/:
                    return A_Screen.lambda7();
                case Sequence.INT_S32_VALUE /*22*/:
                    return this.$main.ListPicker1$AfterPicking();
                case Sequence.INT_U64_VALUE /*23*/:
                    return A_Screen.lambda8();
                case Sequence.INT_S64_VALUE /*24*/:
                    return A_Screen.lambda9();
                case Sequence.FLOAT_VALUE /*25*/:
                    return A_Screen.lambda10();
                case Sequence.DOUBLE_VALUE /*26*/:
                    return A_Screen.lambda11();
                case Sequence.BOOLEAN_VALUE /*27*/:
                    return A_Screen.lambda12();
                case Sequence.TEXT_BYTE_VALUE /*28*/:
                    return A_Screen.lambda13();
                case Sequence.CHAR_VALUE /*29*/:
                    return this.$main.ListPicker2$AfterPicking();
                case XDataType.DAY_TIME_DURATION_TYPE_CODE /*30*/:
                    return A_Screen.lambda14();
                case Sequence.CDATA_VALUE /*31*/:
                    return A_Screen.lambda15();
                case SetExp.SET_IF_UNBOUND /*32*/:
                    return A_Screen.lambda16();
                case Sequence.ELEMENT_VALUE /*33*/:
                    return A_Screen.lambda17();
                case Sequence.DOCUMENT_VALUE /*34*/:
                    return A_Screen.lambda18();
                case Sequence.ATTRIBUTE_VALUE /*35*/:
                    return A_Screen.lambda19();
                case Sequence.COMMENT_VALUE /*36*/:
                    return this.$main.ListPicker3$AfterPicking();
                case Sequence.PROCESSING_INSTRUCTION_VALUE /*37*/:
                    return A_Screen.lambda20();
                case XDataType.STRING_TYPE_CODE /*38*/:
                    return A_Screen.lambda21();
                case XDataType.NORMALIZED_STRING_TYPE_CODE /*39*/:
                    return A_Screen.lambda22();
                case XDataType.TOKEN_TYPE_CODE /*40*/:
                    return A_Screen.lambda23();
                case XDataType.LANGUAGE_TYPE_CODE /*41*/:
                    return A_Screen.lambda24();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return A_Screen.lambda25();
                case XDataType.NAME_TYPE_CODE /*43*/:
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
                case XDataType.NAME_TYPE_CODE /*43*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        Lit106 = (SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve();
        Lit105 = (SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve();
        Lit104 = (SimpleSymbol) new SimpleSymbol("send-error").readResolve();
        Lit103 = (SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve();
        Lit102 = (SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve();
        Lit101 = (SimpleSymbol) new SimpleSymbol("add-to-components").readResolve();
        Lit100 = (SimpleSymbol) new SimpleSymbol("add-to-events").readResolve();
        Lit99 = (SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve();
        Lit98 = (SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve();
        Lit97 = (SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve();
        Lit96 = (SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve();
        Lit95 = (SimpleSymbol) new SimpleSymbol("android-log-form").readResolve();
        Lit94 = new FString("com.google.appinventor.components.runtime.File");
        Lit93 = new FString("com.google.appinventor.components.runtime.File");
        Lit92 = (SimpleSymbol) new SimpleSymbol("Click").readResolve();
        Lit91 = (SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve();
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit90 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/A_Screen.yail", 688207);
        Lit89 = new FString("com.google.appinventor.components.runtime.Button");
        Lit88 = (SimpleSymbol) new SimpleSymbol("Button1").readResolve();
        Lit87 = new FString("com.google.appinventor.components.runtime.Button");
        Lit86 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit85 = (SimpleSymbol) new SimpleSymbol("TextBox3").readResolve();
        Lit84 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit83 = new FString("com.google.appinventor.components.runtime.Label");
        Lit82 = (SimpleSymbol) new SimpleSymbol("Label4").readResolve();
        Lit81 = new FString("com.google.appinventor.components.runtime.Label");
        Lit80 = (SimpleSymbol) new SimpleSymbol("ListPicker3$AfterPicking").readResolve();
        Lit79 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/A_Screen.yail", 577669), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/A_Screen.yail", 577663);
        Lit78 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit77 = (SimpleSymbol) new SimpleSymbol("ListPicker3").readResolve();
        Lit76 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit74 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement3").readResolve();
        Lit73 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit72 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit71 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement5").readResolve();
        Lit70 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit69 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit68 = (SimpleSymbol) new SimpleSymbol("TextBox2").readResolve();
        Lit67 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit66 = new FString("com.google.appinventor.components.runtime.Label");
        Lit65 = (SimpleSymbol) new SimpleSymbol("Label3").readResolve();
        Lit64 = new FString("com.google.appinventor.components.runtime.Label");
        Lit63 = (SimpleSymbol) new SimpleSymbol("ListPicker2$AfterPicking").readResolve();
        Lit62 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/A_Screen.yail", 417925), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/A_Screen.yail", 417919);
        Lit61 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit60 = (SimpleSymbol) new SimpleSymbol("ListPicker2").readResolve();
        Lit59 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit58 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit57 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve();
        Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit55 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit54 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement4").readResolve();
        Lit53 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit52 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit51 = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve();
        Lit50 = (SimpleSymbol) new SimpleSymbol("MultiLine").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("Hint").readResolve();
        Lit48 = (SimpleSymbol) new SimpleSymbol("TextBox1").readResolve();
        Lit47 = new FString("com.google.appinventor.components.runtime.TextBox");
        Lit46 = new FString("com.google.appinventor.components.runtime.Label");
        Lit45 = IntNum.make(16);
        Lit44 = (SimpleSymbol) new SimpleSymbol("Label2").readResolve();
        Lit43 = new FString("com.google.appinventor.components.runtime.Label");
        Lit42 = (SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve();
        Lit41 = (SimpleSymbol) new SimpleSymbol("ListPicker1$AfterPicking").readResolve();
        Lit40 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/A_Screen.yail", 249989), "/tmp/1477721769135_0.6770176203586532-0/youngandroidproject/../src/appinventor/ai_mathew_mullen_mechtly/CodeForGood/A_Screen.yail", 249983);
        Lit39 = (SimpleSymbol) new SimpleSymbol("Selection").readResolve();
        Lit38 = (SimpleSymbol) new SimpleSymbol("AppendToFile").readResolve();
        Lit37 = (SimpleSymbol) new SimpleSymbol("File1").readResolve();
        Lit36 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit35 = IntNum.make(2);
        Lit34 = (SimpleSymbol) new SimpleSymbol("Shape").readResolve();
        Lit33 = (SimpleSymbol) new SimpleSymbol("ElementsFromString").readResolve();
        Lit32 = (SimpleSymbol) new SimpleSymbol("ListPicker1").readResolve();
        Lit31 = new FString("com.google.appinventor.components.runtime.ListPicker");
        Lit30 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit29 = (SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve();
        Lit28 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit27 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit26 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement3").readResolve();
        Lit25 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit24 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit23 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement2").readResolve();
        Lit22 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit21 = new FString("com.google.appinventor.components.runtime.Label");
        Lit20 = (SimpleSymbol) new SimpleSymbol("Text").readResolve();
        Lit19 = (SimpleSymbol) new SimpleSymbol("Width").readResolve();
        Lit18 = IntNum.make(-2);
        Lit17 = (SimpleSymbol) new SimpleSymbol("Height").readResolve();
        Lit16 = IntNum.make(22);
        Lit15 = (SimpleSymbol) new SimpleSymbol("FontSize").readResolve();
        Lit14 = (SimpleSymbol) new SimpleSymbol("Label1").readResolve();
        Lit13 = new FString("com.google.appinventor.components.runtime.Label");
        Lit12 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit11 = (SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve();
        Lit10 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
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
        Lit0 = (SimpleSymbol) new SimpleSymbol("A_Screen").readResolve();
    }

    public A_Screen() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame = new frame();
        appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame.$main = this;
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 1, Lit95, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 2, Lit96, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 3, Lit97, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 5, Lit98, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 6, Lit99, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 7, Lit100, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 8, Lit101, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 9, Lit102, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 10, Lit103, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 11, Lit104, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 13, Lit105, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 14, Lit106, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime3960804766349238341.scm:547");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 21, null, 0);
        this.ListPicker1$AfterPicking = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 22, Lit41, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 28, null, 0);
        this.ListPicker2$AfterPicking = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 29, Lit63, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 31, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 32, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 33, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 34, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 35, null, 0);
        this.ListPicker3$AfterPicking = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 36, Lit80, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 37, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 38, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 39, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 40, null, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 41, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 42, null, 0);
        this.Button1$Click = new ModuleMethod(appinventor_ai_mathew_mullen_mechtly_CodeForGood_A_Screen_frame, 43, Lit91, 0);
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
            A_Screen = null;
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
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "A Screen", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit10, Lit11, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit12, Lit11, Boolean.FALSE);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit11, Lit13, Lit14, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit11, Lit21, Lit14, lambda$Fn4);
                }
                this.VerticalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit22, Lit23, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit24, Lit23, Boolean.FALSE);
                }
                this.VerticalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit25, Lit26, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit27, Lit26, Boolean.FALSE);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit28, Lit29, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit26, Lit30, Lit29, Boolean.FALSE);
                }
                this.ListPicker1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit29, Lit31, Lit32, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit29, Lit36, Lit32, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit41, this.ListPicker1$AfterPicking);
                } else {
                    addToFormEnvironment(Lit41, this.ListPicker1$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker1", "AfterPicking");
                } else {
                    addToEvents(Lit32, Lit42);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit29, Lit43, Lit44, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit29, Lit46, Lit44, lambda$Fn8);
                }
                this.TextBox1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit47, Lit48, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit26, Lit52, Lit48, lambda$Fn10);
                }
                this.VerticalArrangement4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit53, Lit54, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit55, Lit54, Boolean.FALSE);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit54, Lit56, Lit57, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit54, Lit58, Lit57, Boolean.FALSE);
                }
                this.ListPicker2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit57, Lit59, Lit60, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit57, Lit61, Lit60, lambda$Fn12);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit63, this.ListPicker2$AfterPicking);
                } else {
                    addToFormEnvironment(Lit63, this.ListPicker2$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker2", "AfterPicking");
                } else {
                    addToEvents(Lit60, Lit42);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit57, Lit64, Lit65, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit57, Lit66, Lit65, lambda$Fn14);
                }
                this.TextBox2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit54, Lit67, Lit68, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit54, Lit69, Lit68, lambda$Fn16);
                }
                this.VerticalArrangement5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit70, Lit71, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit72, Lit71, Boolean.FALSE);
                }
                this.HorizontalArrangement3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit73, Lit74, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit71, Lit75, Lit74, Boolean.FALSE);
                }
                this.ListPicker3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit76, Lit77, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit74, Lit78, Lit77, lambda$Fn18);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit80, this.ListPicker3$AfterPicking);
                } else {
                    addToFormEnvironment(Lit80, this.ListPicker3$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "ListPicker3", "AfterPicking");
                } else {
                    addToEvents(Lit77, Lit42);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit74, Lit81, Lit82, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit74, Lit83, Lit82, lambda$Fn20);
                }
                this.TextBox3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit71, Lit84, Lit85, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit71, Lit86, Lit85, lambda$Fn22);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit87, Lit88, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit89, Lit88, lambda$Fn24);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit91, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit91, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit88, Lit92);
                }
                this.File1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit93, Lit37, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit94, Lit37, Boolean.FALSE);
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
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit9, "A Screen", Lit4);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit15, Lit16, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit17, Lit18, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit19, Lit18, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit20, "Overall Achievement: Slavery has been ended in this location.", Lit4);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit15, Lit16, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit17, Lit18, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit19, Lit18, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit20, "Overall Achievement: Slavery has been ended in this location.", Lit4);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit32, Lit33, "Completely true,Partially true,Completely untrue", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit32, Lit34, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit20, "Choose One...", Lit4);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit32, Lit33, "Completely true,Partially true,Completely untrue", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit32, Lit34, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit20, "Choose One...", Lit4);
    }

    public Object ListPicker1$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit37, Lit38, LList.list2(runtime.getProperty$1(Lit32, Lit39), "/a-screen.txt"), Lit40);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit15, Lit45, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit20, "Traffickers, whether from the village or from outside the village, cannot operate anymore.", Lit4);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit44, Lit15, Lit45, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit44, Lit20, "Traffickers, whether from the village or from outside the village, cannot operate anymore.", Lit4);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit49, "Comments", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit50, Boolean.TRUE, Lit51);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit48, Lit49, "Comments", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit50, Boolean.TRUE, Lit51);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit33, "Completely true,Partially true,Completely untrue", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit34, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit20, "Choose One...", Lit4);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit60, Lit33, "Completely true,Partially true,Completely untrue", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit60, Lit34, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit20, "Choose One...", Lit4);
    }

    public Object ListPicker2$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit37, Lit38, LList.list2(runtime.getProperty$1(Lit60, Lit39), "/a-screen.txt"), Lit62);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit15, Lit45, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit20, "No one residing in this village is in any form of slavery.", Lit4);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit15, Lit45, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit20, "No one residing in this village is in any form of slavery.", Lit4);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit49, "Comments", Lit4);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit68, Lit49, "Comments", Lit4);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit33, "Completely true,Partially true,Completely untrue", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit34, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit20, "Choose One...", Lit4);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit77, Lit33, "Completely true,Partially true,Completely untrue", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit77, Lit34, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit77, Lit20, "Choose One...", Lit4);
    }

    public Object ListPicker3$AfterPicking() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit37, Lit38, LList.list2(runtime.getProperty$1(Lit77, Lit39), "/a-screen.txt"), Lit79);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit15, Lit45, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit20, "People who migrate from this community for work are NOT being trafficked.", Lit4);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit15, Lit45, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit20, "People who migrate from this community for work are NOT being trafficked.", Lit4);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit49, "Comments", Lit4);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit49, "Comments", Lit4);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit88, Lit34, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit88, Lit20, "Data Sheet B", Lit4);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit88, Lit34, Lit35, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit88, Lit20, "Data Sheet B", Lit4);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("B_Screen"), Lit90, "open another screen");
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
        A_Screen = this;
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
        A_Screen closureEnv = this;
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
