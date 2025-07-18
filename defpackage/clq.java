package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class clq {
    public clq() {
    }

    public static void A(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(u(str, obj));
        }
    }

    public static void B(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(u(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void C(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(u(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void D(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(u(str, obj, obj2));
        }
    }

    public static void E(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? af(i, i3, "start index") : (i2 < 0 || i2 > i3) ? af(i2, i3, "end index") : u("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void F(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void G(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void H(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(u(str, Integer.valueOf(i)));
        }
    }

    public static void I(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(u(str, Long.valueOf(j)));
        }
    }

    public static void J(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(u(str, obj));
        }
    }

    public static void K(int i, int i2) {
        String strU;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strU = u("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.x(i2, "negative size: "));
                }
                strU = u("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strU);
        }
    }

    public static void L(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(af(i, i2, "index"));
        }
    }

    public static void M(boolean z, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(u("%s -> %s", obj, obj2));
        }
    }

    public static String N(String str) {
        return str == null ? "" : str;
    }

    public static boolean O(String str) {
        return str == null || str.isEmpty();
    }

    public static crt P(Class cls) {
        return new crt(cls.getSimpleName());
    }

    public static crt Q(Object obj) {
        return new crt(obj.getClass().getSimpleName());
    }

    public static Object R(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static String S(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (U(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (U(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean T(CharSequence charSequence, CharSequence charSequence2) {
        int iAg;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iAg = ag(cCharAt)) >= 26 || iAg != ag(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean U(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static void V(cqn cqnVar) {
        String strB = cqnVar.b();
        int i = cqa.a;
        if (strB.length() > 127) {
            strB = strB.substring(0, 127);
        }
        Trace.beginSection(strB);
    }

    public static void W(cqn cqnVar) {
        if (Y(cqnVar)) {
            Trace.beginSection("<propagated>");
            V(cqnVar);
        } else {
            if (cqnVar.a() != null) {
                W(cqnVar.a());
            }
            V(cqnVar);
        }
    }

    public static void X(cqn cqnVar) {
        if (Y(cqnVar)) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            if (cqnVar.a() != null) {
                X(cqnVar.a());
            }
        }
    }

    public static boolean Y(cqn cqnVar) {
        return cqnVar.c() != Thread.currentThread();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [cqn] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static cqg Z(String str, int i) {
        boolean z;
        ?? r10;
        cqn cqnVarG;
        cqe cqeVar;
        cqi cqiVar = cqh.a;
        ezn eznVarH = cqa.h();
        Object obj = eznVarH.c;
        if (obj == cqf.a) {
            cqa.i(eznVarH, null);
            z = true;
            r10 = 0;
        } else {
            z = false;
            r10 = obj;
        }
        if (r10 == 0) {
            UUID uuidB = cqb.a.b();
            if (cqo.a()) {
                cpq cpqVar = new cpq();
                cqe.j(uuidB, cpqVar);
                cqeVar = new cqe(uuidB, str, cqiVar, cpqVar, false, cqa.e(cpqVar), eznVarH);
            } else {
                cpq cpqVar2 = cqc.a;
                cqe.j(uuidB, null);
                cqeVar = new cqe(uuidB, str, cqiVar, cpqVar2, false, false, eznVarH);
            }
            boolean z2 = cqeVar.a;
            cqnVarG = cqeVar;
        } else {
            cqnVarG = r10 instanceof cps ? ((cps) r10).g(str, cqiVar, false, eznVarH) : r10.k(str, cqiVar, eznVarH);
        }
        cqa.i(eznVarH, cqnVarG);
        return new cqg(cqnVarG, z);
    }

    public static void a(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static IOException aa(fcy fcyVar, Uri uri, IOException iOException, String str) {
        try {
            cie cieVar = new cie();
            cieVar.a = true;
            File file = (File) fcyVar.g(uri, cieVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? ae(file, iOException, str) : ae(file, iOException, str) : file.canWrite() ? ae(file, iOException, str) : ae(file, iOException, str) : file.canRead() ? file.canWrite() ? ae(file, iOException, str) : ae(file, iOException, str) : file.canWrite() ? ae(file, iOException, str) : ae(file, iOException, str) : ae(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    private static Drawable ab(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    private static int ac(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }

    private static IOException ad(File file, IOException iOException, String str) throws ErrnoException {
        String strConcat;
        try {
            strConcat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                strConcat = strConcat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = String.valueOf("Inoperable file:").concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    private static IOException ae(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? ad(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? ad(file, iOException, str) : ad(file, iOException, str) : parentFile.canWrite() ? ad(file, iOException, str) : ad(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? ad(file, iOException, str) : ad(file, iOException, str) : parentFile.canWrite() ? ad(file, iOException, str) : ad(file, iOException, str) : ad(file, iOException, str);
    }

    private static String af(int i, int i2, String str) {
        if (i < 0) {
            return u("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return u("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.x(i2, "negative size: "));
    }

    private static int ag(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static ColorStateList b(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static Drawable c(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i != -1 && i2 == -1) {
            i2 = -1;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return ab(drawable, colorStateList, mode);
    }

    public static Drawable e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return ab(drawable, colorStateList, mode);
    }

    public static int[] f(int[] iArr) {
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = 16842912;
                return iArrCopyOf;
            }
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
            i++;
        }
    }

    public static int g(int i, int i2) {
        return ry.c(i, (Color.alpha(i) * i2) / AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
    }

    public static int h(View view, int i) {
        Class<?> cls = view.getClass();
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = cls.getCanonicalName();
        TypedValue typedValueL = cnx.l(context2, i);
        if (typedValueL != null) {
            return ac(context, typedValueL);
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i)));
    }

    public static int i(int i, int i2, float f) {
        return ry.b(ry.c(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static Integer j(Context context, int i) {
        TypedValue typedValueL = cnx.l(context, i);
        if (typedValueL != null) {
            return Integer.valueOf(ac(context, typedValueL));
        }
        return null;
    }

    public static int k(Context context, int i) {
        Integer numJ = j(context, i);
        if (numJ != null) {
            return numJ.intValue();
        }
        return 0;
    }

    public static void l(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    public static Uri m(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static djy n(djy djyVar) {
        return dij.i(djyVar, new crq(), diy.a);
    }

    public static void o(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static File p(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static SharedPreferences q(Context context) {
        return context.getSharedPreferences("PhenotypeStickyAccount", 0);
    }

    public static void r(djy djyVar) {
        djyVar.c(new bks(djyVar, 19, null), diy.a);
    }

    public static boolean s(List list) {
        return cge.c(list);
    }

    public static csg t(csg csgVar) {
        return ((csgVar instanceof csi) || (csgVar instanceof csh)) ? csgVar : csgVar instanceof Serializable ? new csh(csgVar) : new csi(csgVar);
    }

    public static String u(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = strValueOf.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void v(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void w(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void x(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(u(str, Character.valueOf(c)));
        }
    }

    public static void y(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(u(str, Integer.valueOf(i)));
        }
    }

    public static void z(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(u(str, Long.valueOf(j)));
        }
    }

    public clq(byte[] bArr) {
        this((char[]) null);
    }

    public clq(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this();
    }

    public clq(char[] cArr) {
        this();
    }

    public clq(short[] sArr) {
    }
}
