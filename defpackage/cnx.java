package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cnx {
    public cnx() {
    }

    public static djy A() {
        djs djsVar = djs.a;
        return djsVar != null ? djsVar : new djs();
    }

    public static djy B(Throwable th) {
        th.getClass();
        return new djt(th);
    }

    public static djy C(Object obj) {
        return obj == null ? dju.a : new dju(obj);
    }

    public static djy D(djy djyVar) {
        if (djyVar.isDone()) {
            return djyVar;
        }
        djm djmVar = new djm(djyVar);
        djyVar.c(djmVar, diy.a);
        return djmVar;
    }

    public static djy E(Callable callable, Executor executor) {
        dkp dkpVar = new dkp(callable);
        executor.execute(dkpVar);
        return dkpVar;
    }

    public static djy F(dir dirVar, Executor executor) {
        dkp dkpVar = new dkp(dirVar);
        executor.execute(dkpVar);
        return dkpVar;
    }

    public static djy G(djy djyVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (djyVar.isDone()) {
            return djyVar;
        }
        dkm dkmVar = new dkm(djyVar);
        dkk dkkVar = new dkk(dkmVar);
        dkmVar.b = scheduledExecutorService.schedule(dkkVar, j, timeUnit);
        djyVar.c(dkkVar, diy.a);
        return dkmVar;
    }

    public static Object H(Future future) {
        clq.J(future.isDone(), "Future was expected to be done: %s", future);
        return a.f(future);
    }

    public static Object I(Future future) {
        try {
            return a.f(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new dja((Error) e.getCause());
            }
            throw new dkq(e.getCause());
        }
    }

    public static void J(djy djyVar, djj djjVar, Executor executor) {
        djyVar.c(new djk(djyVar, djjVar), executor);
    }

    public static void K(djy djyVar, Future future) {
        if (djyVar instanceof dif) {
            ((dif) djyVar).o(future);
        } else {
            if (djyVar == null || !djyVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    public static ezo L(Iterable iterable) {
        return new ezo(false, cxc.n(iterable));
    }

    public static ezo M(Iterable iterable) {
        return new ezo(true, cxc.n(iterable));
    }

    public static int N(byte b) {
        return b & 255;
    }

    public static int O(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int P(int i, int i2, int i3) {
        clq.B(true, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int Q(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void R(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    public static void S(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void T(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void U(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void V(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static boolean W(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static float X(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    private static String Y(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean Z(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    private static long aa(byte[] bArr, int i, int i2) {
        return (ab(bArr, i) >> i2) & 67108863;
    }

    private static long ab(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16)) & 4294967295L;
    }

    private static void ac(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static void b(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof coa) {
            ((coa) background).l(f);
        }
    }

    public static void c(View view) {
        Drawable background = view.getBackground();
        if (background instanceof coa) {
            d(view, (coa) background);
        }
    }

    public static void d(View view, coa coaVar) {
        clr clrVar = coaVar.a.b;
        if (clrVar == null || !clrVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        cny cnyVar = coaVar.a;
        if (cnyVar.n != elevation) {
            cnyVar.n = elevation;
            coaVar.r();
        }
    }

    public static Typeface e(Configuration configuration, Typeface typeface) {
        if (configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, un.F(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    static cnx f(int i) {
        return i != 1 ? new cod() : new cnw();
    }

    public static /* synthetic */ boolean g(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static int h(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static ColorStateList i(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = rm.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public static Drawable j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableT;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableT = a.t(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableT;
    }

    public static int k(Context context, int i, int i2) {
        TypedValue typedValueL = l(context, i);
        return (typedValueL == null || typedValueL.type != 16) ? i2 : typedValueL.data;
    }

    public static TypedValue l(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean m(Context context, int i, boolean z) {
        TypedValue typedValueL = l(context, i);
        return (typedValueL == null || typedValueL.type != 18) ? z : typedValueL.data != 0;
    }

    public static TimeInterpolator n(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!Z(strValueOf, "cubic-bezier") && !Z(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (Z(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = Y(strValueOf, "cubic-bezier").split(",");
            int length = strArrSplit.length;
            if (length == 4) {
                return new PathInterpolator(X(strArrSplit, 0), X(strArrSplit, 1), X(strArrSplit, 2), X(strArrSplit, 3));
            }
            throw new IllegalArgumentException(a.x(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
        }
        if (!Z(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String strY = Y(strValueOf, "path");
        Path path = new Path();
        try {
            ul.m(ul.n(strY), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(strY)), e);
        }
    }

    public static boolean o(float[] fArr) {
        float f = fArr[0];
        for (int i = 1; i < 4; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static KeyStore q() throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static byte[] r(byte[] bArr, byte[] bArr2) {
        long jAa = aa(bArr, 0, 0);
        long jAa2 = aa(bArr, 3, 2) & 67108611;
        long jAa3 = aa(bArr, 6, 4) & 67092735;
        long jAa4 = aa(bArr, 9, 6) & 66076671;
        long jAa5 = aa(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j6 = j + (j2 >> 26);
                long j7 = j6 & 67108863;
                long j8 = j3 + (j6 >> 26);
                long j9 = j8 & 67108863;
                long j10 = j4 + (j8 >> 26);
                long j11 = j10 & 67108863;
                long j12 = j5 + ((j10 >> 26) * 5);
                long j13 = j12 & 67108863;
                long j14 = j13 + 5;
                long j15 = (j2 & 67108863) + (j12 >> 26);
                long j16 = j15 + (j14 >> 26);
                long j17 = (j16 >> 26) + j7;
                long j18 = j9 + (j17 >> 26);
                long j19 = (j11 + (j18 >> 26)) - 67108864;
                long j20 = j19 >> 63;
                long j21 = ~j20;
                long j22 = (j15 & j20) | (j16 & 67108863 & j21);
                long j23 = (j7 & j20) | (j17 & 67108863 & j21);
                long j24 = (j9 & j20) | (j18 & 67108863 & j21);
                long j25 = (j11 & j20) | (j19 & j21);
                long jAb = (((j20 & j13) | (j14 & 67108863 & j21) | (j22 << 26)) & 4294967295L) + ab(bArr, 16);
                long jAb2 = (((j22 >> 6) | (j23 << 20)) & 4294967295L) + ab(bArr, 20);
                long jAb3 = (((j23 >> 12) | (j24 << 14)) & 4294967295L) + ab(bArr, 24);
                long jAb4 = (((j24 >> 18) | (j25 << 8)) & 4294967295L) + ab(bArr, 28);
                byte[] bArr4 = new byte[16];
                ac(bArr4, jAb & 4294967295L, 0);
                long j26 = jAb2 + (jAb >> 32);
                ac(bArr4, j26 & 4294967295L, 4);
                long j27 = jAb3 + (j26 >> 32);
                ac(bArr4, j27 & 4294967295L, 8);
                ac(bArr4, (jAb4 + (j27 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i, (byte) 0);
            }
            long j28 = jAa5 * 5;
            long j29 = jAa4 * 5;
            long j30 = jAa3 * 5;
            long jAa6 = j5 + aa(bArr3, 0, 0);
            long jAa7 = j2 + aa(bArr3, 3, 2);
            long jAa8 = j + aa(bArr3, 6, 4);
            long jAa9 = j3 + aa(bArr3, 9, 6);
            long jAa10 = j4 + (aa(bArr3, 12, 8) | (bArr3[16] << 24));
            long j31 = jAa7 * jAa;
            long j32 = jAa7 * jAa2;
            long j33 = jAa7 * jAa3;
            long j34 = jAa9 * jAa;
            long j35 = jAa7 * jAa4;
            long j36 = jAa10 * jAa;
            long j37 = (jAa6 * jAa) + (jAa7 * j28) + (jAa8 * j29) + (jAa9 * j30) + (jAa2 * 5 * jAa10);
            long j38 = (jAa6 * jAa2) + j31 + (jAa8 * j28) + (jAa9 * j29) + (j30 * jAa10) + (j37 >> 26);
            long j39 = (jAa6 * jAa3) + j32 + (jAa8 * jAa) + (jAa9 * j28) + (j29 * jAa10) + (j38 >> 26);
            long j40 = (jAa6 * jAa4) + j33 + (jAa8 * jAa2) + j34 + (jAa10 * j28) + (j39 >> 26);
            long j41 = (jAa6 * jAa5) + j35 + (jAa8 * jAa3) + (jAa9 * jAa2) + j36 + (j40 >> 26);
            long j42 = (j37 & 67108863) + ((j41 >> 26) * 5);
            j2 = (j38 & 67108863) + (j42 >> 26);
            i2 += 16;
            j = j39 & 67108863;
            j3 = j40 & 67108863;
            j4 = j41 & 67108863;
            i = 17;
            j5 = j42 & 67108863;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    public static dli s(byte[] bArr) throws GeneralSecurityException {
        try {
            een eenVar = een.a;
            egr egrVar = egr.a;
            dve dveVar = (dve) efb.parseFrom(dve.a, bArr, een.a);
            drt drtVar = drt.a;
            dsg dsgVarA = dsg.a(dveVar);
            return !((egc) drtVar.b.get()).a.containsKey(new dsl(dsgVarA.getClass(), dsgVarA.a)) ? new drh(dsgVarA) : drtVar.b(dsgVarA);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] t(dli dliVar) {
        return dliVar instanceof drh ? ((drh) dliVar).a.b.toByteArray() : ((dsg) drt.a.d(dliVar, dsg.class)).b.toByteArray();
    }

    public static void u(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static djz v(ExecutorService executorService) {
        return executorService instanceof djz ? (djz) executorService : executorService instanceof ScheduledExecutorService ? new dke((ScheduledExecutorService) executorService) : new dkb(executorService);
    }

    public static Executor w(final Executor executor, final dif difVar) {
        executor.getClass();
        return executor == diy.a ? executor : new Executor() { // from class: dka
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                cnx.x(executor, difVar, runnable);
            }
        };
    }

    public static /* synthetic */ void x(Executor executor, dif difVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            difVar.e(e);
        }
    }

    public static dke y(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof dke ? (dke) scheduledExecutorService : new dke(scheduledExecutorService);
    }

    public static djy z(Iterable iterable) {
        return new dit(cxc.n(iterable), null);
    }

    public cnx(byte[] bArr) {
    }

    public cnx(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.e = SwipeDismissBehavior.E(0.1f);
        swipeDismissBehavior.f = SwipeDismissBehavior.E(0.6f);
        swipeDismissBehavior.c = 0;
    }

    public void a(coq coqVar, float f, float f2) {
    }
}
