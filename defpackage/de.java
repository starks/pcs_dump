package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class de extends cp implements LayoutInflater.Factory2, fd {
    private static final oc I = new oc();
    private static final int[] J = {R.attr.windowBackground};
    public static final boolean f = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    boolean B;
    public int C;
    public boolean D;
    public int E;
    public Rect F;
    public Rect G;
    private cw K;
    private CharSequence L;
    private dd M;
    private boolean N;
    private TextView O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private dc[] S;
    private boolean T;
    private boolean U;
    private Configuration V;
    private int W;
    private int X;
    private boolean Y;
    private cz Z;
    private cz aa;
    private boolean ac;
    private AppCompatViewInflater ad;
    private OnBackInvokedDispatcher ae;
    private OnBackInvokedCallback af;
    private dd ag;
    final Object g;
    final Context h;
    public Window i;
    final cn j;
    cc k;
    MenuInflater l;
    public id m;
    ei n;
    public ActionBarContextView o;
    public PopupWindow p;
    public Runnable q;
    ViewGroup s;
    public View t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    public dc z;
    public fsc H = null;
    public boolean r = true;
    private final Runnable ab = new p(this, 7, null);

    public de(Context context, Window window, cn cnVar, Object obj) {
        cm cmVar = null;
        this.W = -100;
        this.h = context;
        this.j = cnVar;
        this.g = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof cm)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        cmVar = (cm) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (cmVar != null) {
                this.W = ((de) cmVar.q()).W;
            }
        }
        if (this.W == -100) {
            oc ocVar = I;
            Integer num = (Integer) ocVar.get(this.g.getClass().getName());
            if (num != null) {
                this.W = num.intValue();
                ocVar.remove(this.g.getClass().getName());
            }
        }
        if (window != null) {
            T(window);
        }
        gy.f();
    }

    private final cz R(Context context) {
        if (this.aa == null) {
            this.aa = new cx(this, context);
        }
        return this.aa;
    }

    private final cz S(Context context) {
        if (this.Z == null) {
            if (fcy.d == null) {
                Context applicationContext = context.getApplicationContext();
                fcy.d = new fcy(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Z = new da(this, fcy.d);
        }
        return this.Z;
    }

    private final void T(Window window) {
        if (this.i != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof cw) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        cw cwVar = new cw(this, callback);
        this.K = cwVar;
        window.setCallback(cwVar);
        zw zwVarQ = zw.q(this.h, null, J);
        Drawable drawableJ = zwVarQ.j(0);
        if (drawableJ != null) {
            window.setBackgroundDrawable(drawableJ);
        }
        zwVarQ.m();
        this.i = window;
        if (this.ae == null) {
            Object obj = this.g;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.ae = null;
            } else {
                this.ae = ((Activity) this.g).getOnBackInvokedDispatcher();
            }
            G();
        }
    }

    private final void U() {
        if (this.i == null) {
            Object obj = this.g;
            if (obj instanceof Activity) {
                T(((Activity) obj).getWindow());
            }
        }
        if (this.i == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void V(int i) {
        this.E = (1 << i) | this.E;
        if (this.D) {
            return;
        }
        View decorView = this.i.getDecorView();
        Runnable runnable = this.ab;
        int[] iArr = ut.a;
        decorView.postOnAnimation(runnable);
        this.D = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void W(defpackage.dc r13, android.view.KeyEvent r14) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.W(dc, android.view.KeyEvent):void");
    }

    private final void X() {
        if (this.N) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private final boolean Y(boolean z) {
        return M(z);
    }

    final void A(dc dcVar, boolean z) {
        ViewGroup viewGroup;
        id idVar;
        if (z && dcVar.a == 0 && (idVar = this.m) != null && idVar.s()) {
            z(dcVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.h.getSystemService("window");
        if (windowManager != null && dcVar.m && (viewGroup = dcVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                y(dcVar.a, dcVar, null);
            }
        }
        dcVar.k = false;
        dcVar.l = false;
        dcVar.m = false;
        dcVar.f = null;
        dcVar.o = true;
        if (this.z == dcVar) {
            this.z = null;
        }
        if (dcVar.a == 0) {
            G();
        }
    }

    public final void B(int i) {
        dc dcVarP = P(i);
        if (dcVarP.h != null) {
            Bundle bundle = new Bundle();
            dcVarP.h.o(bundle);
            if (bundle.size() > 0) {
                dcVarP.q = bundle;
            }
            dcVarP.h.s();
            dcVarP.h.clear();
        }
        dcVarP.p = true;
        dcVarP.o = true;
        if ((i == 108 || i == 0) && this.m != null) {
            dc dcVarP2 = P(0);
            dcVarP2.k = false;
            K(dcVarP2, null);
        }
    }

    public final void C() {
        fsc fscVar = this.H;
        if (fscVar != null) {
            fscVar.ak();
        }
    }

    public final void D() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.N) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.h.obtainStyledAttributes(dp.j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            q(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            q(AIFeature.Id.LLM_IT_PER_LAYER_GEM);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            q(AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            q(10);
        }
        this.x = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        U();
        this.i.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.h);
        if (this.y) {
            viewGroup = this.w ? (ViewGroup) layoutInflaterFrom.inflate(com.google.android.as.oss.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.android.as.oss.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.x) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.as.oss.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.v = false;
            this.u = false;
        } else if (this.u) {
            TypedValue typedValue = new TypedValue();
            this.h.getTheme().resolveAttribute(com.google.android.as.oss.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new mx(this.h, typedValue.resourceId) : this.h).inflate(com.google.android.as.oss.R.layout.abc_screen_toolbar, (ViewGroup) null);
            id idVar = (id) viewGroup.findViewById(com.google.android.as.oss.R.id.decor_content_parent);
            this.m = idVar;
            idVar.n(x());
            if (this.v) {
                this.m.c(AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_1);
            }
            if (this.P) {
                this.m.c(2);
            }
            if (this.Q) {
                this.m.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.u + ", windowActionBarOverlay: " + this.v + ", android:windowIsFloating: " + this.x + ", windowActionModeOverlay: " + this.w + ", windowNoTitle: " + this.y + " }");
        }
        cq cqVar = new cq(this);
        int[] iArr = ut.a;
        un.p(viewGroup, cqVar);
        if (this.m == null) {
            this.O = (TextView) viewGroup.findViewById(com.google.android.as.oss.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.as.oss.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.i.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.i.setContentView(viewGroup);
        contentFrameLayout.i = new fuu(this, null);
        this.s = viewGroup;
        Object obj = this.g;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.L;
        if (!TextUtils.isEmpty(title)) {
            id idVar2 = this.m;
            if (idVar2 != null) {
                idVar2.o(title);
            } else {
                cc ccVar = this.k;
                if (ccVar != null) {
                    ccVar.f(title);
                } else {
                    TextView textView = this.O;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.s.findViewById(R.id.content);
        View decorView = this.i.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.h.obtainStyledAttributes(dp.j);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.N = true;
        dc dcVarP = P(0);
        if (this.B || dcVarP.h != null) {
            return;
        }
        V(AIFeature.Id.LLM_IT_PER_LAYER_GEM);
    }

    public final void E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D();
        if (this.u && this.k == null) {
            Object obj = this.g;
            if (obj instanceof Activity) {
                this.k = new C0000do((Activity) obj, this.v);
            } else if (obj instanceof Dialog) {
                this.k = new C0000do((Dialog) obj);
            }
            cc ccVar = this.k;
            if (ccVar != null) {
                ccVar.c(this.ac);
            }
        }
    }

    @Override // defpackage.fd
    public final void F(ff ffVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        id idVar = this.m;
        if (idVar == null || !idVar.p() || (ViewConfiguration.get(this.h).hasPermanentMenuKey() && !this.m.r())) {
            dc dcVarP = P(0);
            dcVarP.o = true;
            A(dcVarP, false);
            W(dcVarP, null);
            return;
        }
        Window.Callback callbackX = x();
        if (this.m.s()) {
            this.m.q();
            if (this.B) {
                return;
            }
            callbackX.onPanelClosed(AIFeature.Id.LLM_IT_PER_LAYER_GEM, P(0).h);
            return;
        }
        if (callbackX == null || this.B) {
            return;
        }
        if (this.D && (1 & this.E) != 0) {
            this.i.getDecorView().removeCallbacks(this.ab);
            this.ab.run();
        }
        dc dcVarP2 = P(0);
        ff ffVar2 = dcVarP2.h;
        if (ffVar2 == null || dcVarP2.p || !callbackX.onPreparePanel(0, dcVarP2.g, ffVar2)) {
            return;
        }
        callbackX.onMenuOpened(AIFeature.Id.LLM_IT_PER_LAYER_GEM, dcVarP2.h);
        this.m.u();
    }

    final void G() {
        if (this.ae == null || (!P(0).m && this.n == null)) {
            OnBackInvokedCallback onBackInvokedCallback = this.af;
            if (onBackInvokedCallback != null) {
                a.u(this.ae, onBackInvokedCallback);
                this.af = null;
                return;
            }
            return;
        }
        if (this.af == null) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = this.ae;
            OnBackInvokedCallback onBackInvokedCallback2 = new OnBackInvokedCallback() { // from class: cv
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    this.a.I();
                }
            };
            onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, onBackInvokedCallback2);
            this.af = onBackInvokedCallback2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean H(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.H(android.view.KeyEvent):boolean");
    }

    final boolean I() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0000do c0000do;
        ll llVar;
        boolean z = this.T;
        this.T = false;
        dc dcVarP = P(0);
        if (dcVarP.m) {
            if (!z) {
                A(dcVarP, true);
            }
            return true;
        }
        ei eiVar = this.n;
        if (eiVar != null) {
            eiVar.f();
            return true;
        }
        cc ccVarB = b();
        if (ccVarB == null || (llVar = (c0000do = (C0000do) ccVarB).p) == null || !llVar.o()) {
            return false;
        }
        c0000do.p.c();
        return true;
    }

    @Override // defpackage.fd
    public final boolean J(ff ffVar, MenuItem menuItem) {
        dc dcVarV;
        Window.Callback callbackX = x();
        if (callbackX == null || this.B || (dcVarV = v(ffVar.a())) == null) {
            return false;
        }
        return callbackX.onMenuItemSelected(dcVarV.a, menuItem);
    }

    public final boolean K(dc dcVar, KeyEvent keyEvent) {
        id idVar;
        id idVar2;
        Resources.Theme themeNewTheme;
        id idVar3;
        id idVar4;
        if (this.B) {
            return false;
        }
        if (dcVar.k) {
            return true;
        }
        dc dcVar2 = this.z;
        if (dcVar2 != null && dcVar2 != dcVar) {
            A(dcVar2, false);
        }
        Window.Callback callbackX = x();
        if (callbackX != null) {
            dcVar.g = callbackX.onCreatePanelView(dcVar.a);
        }
        int i = dcVar.a;
        boolean z = i == 0 || i == 108;
        if (z && (idVar4 = this.m) != null) {
            idVar4.m();
        }
        if (dcVar.g == null) {
            ff ffVar = dcVar.h;
            if (ffVar == null || dcVar.p) {
                if (ffVar == null) {
                    Context context = this.h;
                    int i2 = dcVar.a;
                    if ((i2 == 0 || i2 == 108) && this.m != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.android.as.oss.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.android.as.oss.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.android.as.oss.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            mx mxVar = new mx(context, 0);
                            mxVar.getTheme().setTo(themeNewTheme);
                            context = mxVar;
                        }
                    }
                    ff ffVar2 = new ff(context);
                    ffVar2.b = this;
                    dcVar.a(ffVar2);
                    if (dcVar.h == null) {
                        return false;
                    }
                }
                if (z && (idVar2 = this.m) != null) {
                    if (this.ag == null) {
                        this.ag = new dd(this, 1);
                    }
                    idVar2.l(dcVar.h, this.ag);
                }
                dcVar.h.s();
                if (!callbackX.onCreatePanelMenu(dcVar.a, dcVar.h)) {
                    dcVar.a(null);
                    if (z && (idVar = this.m) != null) {
                        idVar.l(null, this.ag);
                    }
                    return false;
                }
                dcVar.p = false;
            }
            dcVar.h.s();
            Bundle bundle = dcVar.q;
            if (bundle != null) {
                dcVar.h.n(bundle);
                dcVar.q = null;
            }
            if (!callbackX.onPreparePanel(0, dcVar.g, dcVar.h)) {
                if (z && (idVar3 = this.m) != null) {
                    idVar3.l(null, this.ag);
                }
                dcVar.h.r();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            dcVar.n = z2;
            dcVar.h.setQwertyMode(z2);
            dcVar.h.r();
        }
        dcVar.k = true;
        dcVar.l = false;
        this.z = dcVar;
        return true;
    }

    public final boolean L() {
        ViewGroup viewGroup;
        return this.N && (viewGroup = this.s) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean M(boolean z) throws PackageManager.NameNotFoundException {
        int i;
        boolean z2 = false;
        if (this.B) {
            return false;
        }
        int iR = r();
        Configuration configurationU = u(this.h, s(this.h, iR), null, null, false);
        Context context = this.h;
        boolean z3 = true;
        if (this.Y || !(this.g instanceof Activity)) {
            this.Y = true;
            i = this.X;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.g.getClass()), 269221888);
                    if (activityInfo != null) {
                        this.X = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.X = 0;
                }
                this.Y = true;
                i = this.X;
            }
        }
        Configuration configuration = this.V;
        if (configuration == null) {
            configuration = this.h.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = configurationU.uiMode & 48;
        a.v(configuration);
        int i4 = i2 != i3 ? 512 : 0;
        if (((~i) & i4) != 0 && z && this.A && (f || this.U)) {
            Object obj = this.g;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                ((Activity) this.g).recreate();
                z2 = true;
            }
        }
        if (z2 || i4 == 0) {
            z3 = z2;
        } else {
            int i5 = i & 512;
            Resources resources = this.h.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = i3 | (resources.getConfiguration().uiMode & (-49));
            resources.updateConfiguration(configuration2, null);
            int i6 = this.C;
            if (i6 != 0) {
                this.h.setTheme(i6);
                this.h.getTheme().applyStyle(this.C, true);
            }
            if (i5 == 512) {
                Object obj2 = this.g;
                if (obj2 instanceof Activity) {
                    Activity activity = (Activity) obj2;
                    if (activity instanceof yz) {
                        if (((yz) activity).E().a().a(yv.CREATED)) {
                            activity.onConfigurationChanged(configuration2);
                        }
                    } else if (this.U && !this.B) {
                        activity.onConfigurationChanged(configuration2);
                    }
                }
            }
        }
        if (z3) {
            Object obj3 = this.g;
            if (obj3 instanceof cm) {
            }
        }
        if (iR != 0) {
            cz czVar = this.Z;
            if (czVar != null) {
                czVar.d();
            }
            if (iR == 3) {
                R(this.h).e();
            }
            return z3;
        }
        S(this.h).e();
        cz czVar2 = this.aa;
        if (czVar2 != null) {
            czVar2.d();
        }
        return z3;
    }

    public final void N() {
        Y(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View O(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.O(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final dc P(int i) {
        dc[] dcVarArr = this.S;
        if (dcVarArr == null || dcVarArr.length <= i) {
            dc[] dcVarArr2 = new dc[i + 1];
            if (dcVarArr != null) {
                System.arraycopy(dcVarArr, 0, dcVarArr2, 0, dcVarArr.length);
            }
            this.S = dcVarArr2;
            dcVarArr = dcVarArr2;
        }
        dc dcVar = dcVarArr[i];
        if (dcVar != null) {
            return dcVar;
        }
        dc dcVar2 = new dc(i);
        dcVarArr[i] = dcVar2;
        return dcVar2;
    }

    public final boolean Q(dc dcVar, int i, KeyEvent keyEvent) {
        ff ffVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((dcVar.k || K(dcVar, keyEvent)) && (ffVar = dcVar.h) != null) {
            return ffVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    @Override // defpackage.cp
    public final Context a() {
        return this.h;
    }

    @Override // defpackage.cp
    public final cc b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        E();
        return this.k;
    }

    @Override // defpackage.cp
    public final View c(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D();
        return this.i.findViewById(i);
    }

    @Override // defpackage.cp
    public final void d(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D();
        ((ViewGroup) this.s.findViewById(R.id.content)).addView(view, layoutParams);
        this.K.a(this.i.getCallback());
    }

    @Override // defpackage.cp
    public final void e() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.h);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof de) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.cp
    public final void f() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.k != null) {
            b();
            V(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.g
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.cp.e
            monitor-enter(r0)
            defpackage.cp.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.D
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.i
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ab
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.B = r0
            int r0 = r3.W
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.g
            oc r1 = defpackage.de.I
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.W
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5c
        L4d:
            java.lang.Object r0 = r3.g
            oc r1 = defpackage.de.I
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5c:
            cz r0 = r3.Z
            if (r0 == 0) goto L63
            r0.d()
        L63:
            cz r3 = r3.aa
            if (r3 == 0) goto L6a
            r3.d()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.g():void");
    }

    @Override // defpackage.cp
    public final void h() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        cc ccVarB = b();
        if (ccVarB != null) {
            ccVarB.e(false);
        }
    }

    @Override // defpackage.cp
    public final void j(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.h).inflate(i, viewGroup);
        this.K.a(this.i.getCallback());
    }

    @Override // defpackage.cp
    public final void k(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.K.a(this.i.getCallback());
    }

    @Override // defpackage.cp
    public final void l(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.K.a(this.i.getCallback());
    }

    @Override // defpackage.cp
    public final void m(CharSequence charSequence) {
        this.L = charSequence;
        id idVar = this.m;
        if (idVar != null) {
            idVar.o(charSequence);
            return;
        }
        cc ccVar = this.k;
        if (ccVar != null) {
            ccVar.f(charSequence);
            return;
        }
        TextView textView = this.O;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.cp
    public final void o() throws PackageManager.NameNotFoundException {
        cc ccVarB;
        if (this.u && this.N && (ccVarB = b()) != null) {
            C0000do c0000do = (C0000do) ccVarB;
            c0000do.i(new fsc(c0000do.a).au());
        }
        gy.d().e(this.h);
        this.V = new Configuration(this.h.getResources().getConfiguration());
        M(false);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return O(str, context, attributeSet);
    }

    @Override // defpackage.cp
    public final void p() {
        String strV;
        this.A = true;
        Y(false);
        U();
        Object obj = this.g;
        if (obj instanceof Activity) {
            try {
                strV = qy.v((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strV = null;
            }
            if (strV != null) {
                cc ccVar = this.k;
                if (ccVar == null) {
                    this.ac = true;
                } else {
                    ccVar.c(true);
                }
            }
            synchronized (cp.e) {
                cp.i(this);
                cp.d.add(new WeakReference(this));
            }
        }
        this.V = new Configuration(this.h.getResources().getConfiguration());
        this.U = true;
    }

    @Override // defpackage.cp
    public final void q(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.y && i == 108) {
            return;
        }
        if (this.u && i == 1) {
            this.u = false;
        }
        if (i == 1) {
            X();
            this.y = true;
            return;
        }
        if (i == 2) {
            X();
            this.P = true;
            return;
        }
        if (i == 5) {
            X();
            this.Q = true;
            return;
        }
        if (i == 10) {
            X();
            this.w = true;
        } else if (i == 108) {
            X();
            this.u = true;
        } else if (i != 109) {
            this.i.requestFeature(i);
        } else {
            X();
            this.v = true;
        }
    }

    public final int r() {
        int i = this.W;
        return i != -100 ? i : cp.b;
    }

    final int s(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return S(context).a();
            }
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return ((cx) R(context)).a.isPowerSaveMode() ? 2 : 1;
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i;
    }

    final Context t() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        cc ccVarB = b();
        Context contextA = ccVarB != null ? ccVarB.a() : null;
        return contextA == null ? this.h : contextA;
    }

    public final Configuration u(Context context, int i, sm smVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    final dc v(Menu menu) {
        dc[] dcVarArr = this.S;
        int length = dcVarArr != null ? dcVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            dc dcVar = dcVarArr[i];
            if (dcVar != null && dcVar.h == menu) {
                return dcVar;
            }
        }
        return null;
    }

    final ei w(eh ehVar) {
        Context mxVar;
        C();
        ei eiVar = this.n;
        if (eiVar != null) {
            eiVar.f();
        }
        if (this.o == null) {
            if (this.x) {
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = this.h.getTheme();
                theme.resolveAttribute(com.google.android.as.oss.R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Resources.Theme themeNewTheme = this.h.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                    mxVar = new mx(this.h, 0);
                    mxVar.getTheme().setTo(themeNewTheme);
                } else {
                    mxVar = this.h;
                }
                this.o = new ActionBarContextView(mxVar);
                PopupWindow popupWindow = new PopupWindow(mxVar, (AttributeSet) null, com.google.android.as.oss.R.attr.actionModePopupWindowStyle);
                this.p = popupWindow;
                popupWindow.setWindowLayoutType(2);
                this.p.setContentView(this.o);
                this.p.setWidth(-1);
                mxVar.getTheme().resolveAttribute(com.google.android.as.oss.R.attr.actionBarSize, typedValue, true);
                this.o.e = TypedValue.complexToDimensionPixelSize(typedValue.data, mxVar.getResources().getDisplayMetrics());
                this.p.setHeight(-2);
                this.q = new p(this, 8, null);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.s.findViewById(com.google.android.as.oss.R.id.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.a = LayoutInflater.from(t());
                    this.o = (ActionBarContextView) viewStubCompat.a();
                }
            }
        }
        if (this.o != null) {
            C();
            this.o.i();
            ek ekVar = new ek(this.o.getContext(), this.o, ehVar);
            if (ehVar.c(ekVar, ekVar.a)) {
                ekVar.g();
                this.o.h(ekVar);
                this.n = ekVar;
                if (L()) {
                    this.o.setAlpha(0.0f);
                    fsc fscVarO = ut.o(this.o);
                    fscVarO.al(1.0f);
                    this.H = fscVarO;
                    fscVarO.an(new cs(this));
                } else {
                    this.o.setAlpha(1.0f);
                    this.o.setVisibility(0);
                    if (this.o.getParent() instanceof View) {
                        View view = (View) this.o.getParent();
                        int[] iArr = ut.a;
                        ul.b(view);
                    }
                }
                if (this.p != null) {
                    this.i.getDecorView().post(this.q);
                }
            } else {
                this.n = null;
            }
        }
        G();
        return this.n;
    }

    final Window.Callback x() {
        return this.i.getCallback();
    }

    final void y(int i, dc dcVar, Menu menu) {
        if (menu == null) {
            menu = dcVar.h;
        }
        if (dcVar.m && !this.B) {
            cw cwVar = this.K;
            Window.Callback callback = this.i.getCallback();
            try {
                cwVar.b = true;
                callback.onPanelClosed(i, menu);
            } finally {
                cwVar.b = false;
            }
        }
    }

    final void z(ff ffVar) {
        if (this.R) {
            return;
        }
        this.R = true;
        this.m.a();
        Window.Callback callbackX = x();
        if (callbackX != null && !this.B) {
            callbackX.onPanelClosed(AIFeature.Id.LLM_IT_PER_LAYER_GEM, ffVar);
        }
        this.R = false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return O(str, context, attributeSet);
    }
}
