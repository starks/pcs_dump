package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public class a {
    public a() {
    }

    public static /* synthetic */ String A(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String B(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String C(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String D(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String E(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String G(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String H(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String I(dvn dvnVar, String str) {
        return str + dvnVar.a();
    }

    private static int J(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static /* synthetic */ void a() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ int b(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static /* synthetic */ PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ int d(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ boolean e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ Unsafe h() throws IllegalAccessException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static int j(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(x(i, "Unknown visibility "));
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static bx l(ViewGroup viewGroup) {
        return new bx(viewGroup, null);
    }

    public static bx m(ViewGroup viewGroup, a aVar) {
        aVar.getClass();
        Object tag = viewGroup.getTag(com.google.android.as.oss.R.id.special_effects_controller_view_tag);
        if (tag instanceof bx) {
            return (bx) tag;
        }
        bx bxVarL = l(viewGroup);
        viewGroup.setTag(com.google.android.as.oss.R.id.special_effects_controller_view_tag, bxVarL);
        return bxVarL;
    }

    public static void s(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof lp) {
                editorInfo.hintText = ((lp) parent).a();
                return;
            }
        }
    }

    public static Drawable t(Context context, int i) {
        return kp.e().c(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(Object obj, Object obj2) {
        obj.unregisterOnBackInvokedCallback(obj2);
    }

    public static void v(Configuration configuration) {
        String languageTags = configuration.getLocales().toLanguageTags();
        sm smVar = sm.a;
        if (languageTags == null || languageTags.isEmpty()) {
            return;
        }
        String[] strArrSplit = languageTags.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str = strArrSplit[i];
            int i2 = sl.a;
            localeArr[i] = Locale.forLanguageTag(str);
        }
        sm.a(localeArr);
    }

    public static bnz w(Context context, ab abVar, boolean z, boolean z2) throws Resources.NotFoundException {
        z zVar = abVar.R;
        int iJ = 0;
        int i = zVar == null ? 0 : zVar.f;
        int iP = z2 ? z ? abVar.p() : abVar.q() : z ? abVar.n() : abVar.o();
        abVar.U(0, 0, 0, 0);
        ViewGroup viewGroup = abVar.N;
        if (viewGroup != null && viewGroup.getTag(com.google.android.as.oss.R.id.visible_removing_fragment_view_tag) != null) {
            abVar.N.setTag(com.google.android.as.oss.R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abVar.N;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (iP != 0) {
            iJ = iP;
        } else if (i != 0) {
            iJ = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z ? J(context, R.attr.activityOpenEnterAnimation) : J(context, R.attr.activityOpenExitAnimation) : true != z ? com.google.android.as.oss.R.animator.fragment_fade_exit : com.google.android.as.oss.R.animator.fragment_fade_enter : z ? J(context, R.attr.activityCloseEnterAnimation) : J(context, R.attr.activityCloseExitAnimation) : true != z ? com.google.android.as.oss.R.animator.fragment_close_exit : com.google.android.as.oss.R.animator.fragment_close_enter : true != z ? com.google.android.as.oss.R.animator.fragment_open_exit : com.google.android.as.oss.R.animator.fragment_open_enter;
        }
        if (iJ != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iJ));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iJ);
                    if (animationLoadAnimation != null) {
                        return new bnz(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iJ);
                    if (animatorLoadAnimator != null) {
                        return new bnz(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iJ);
                    if (animationLoadAnimation2 != null) {
                        return new bnz(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String x(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String y(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String z(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public final int i(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return j(view.getVisibility());
    }

    public void n() {
        throw null;
    }

    public void o(int i, int i2, Object obj) {
        throw null;
    }

    public void p(int i, int i2) {
        throw null;
    }

    public void q(int i, int i2) {
        throw null;
    }

    public void r(int i, int i2) {
        throw null;
    }

    public a(byte[] bArr, byte[] bArr2, char[] cArr) {
        this();
    }

    public a(char[] cArr) {
    }
}
