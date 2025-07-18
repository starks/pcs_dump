package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Shader;
import android.os.Binder;
import android.os.Process;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ul {
    public static int A(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int B(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (y(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0179, code lost:
    
        if (r12.size() <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017b, code lost:
    
        r0 = new defpackage.bnz((java.util.List) r12, (java.util.List) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0182, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0186, code lost:
    
        if (r18 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0188, code lost:
    
        r0 = new defpackage.bnz(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018e, code lost:
    
        r0 = new defpackage.bnz(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0194, code lost:
    
        if (r13 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0197, code lost:
    
        if (r13 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0199, code lost:
    
        r13 = new android.graphics.LinearGradient(r22, r23, r16, r17, (int[]) r0.a, (float[]) r0.b, E(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b3, code lost:
    
        r13 = new android.graphics.SweepGradient(r10, r5, (int[]) r0.a, (float[]) r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c5, code lost:
    
        if (r21 <= 0.0f) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c7, code lost:
    
        r13 = new android.graphics.RadialGradient(r10, r5, r21, (int[]) r0.a, (float[]) r0.b, E(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e2, code lost:
    
        r0 = new defpackage.ahn(r13, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f1, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e A[Catch: Exception -> 0x023e, TRY_LEAVE, TryCatch #0 {Exception -> 0x023e, blocks: (B:12:0x0039, B:13:0x0041, B:17:0x004c, B:18:0x0053, B:19:0x0054, B:34:0x0080, B:36:0x008a, B:37:0x0102, B:39:0x010c, B:56:0x0175, B:58:0x017b, B:68:0x0199, B:73:0x01e2, B:69:0x01b3, B:72:0x01c7, B:74:0x01ea, B:75:0x01f1, B:63:0x0188, B:64:0x018e, B:46:0x011c, B:48:0x0128, B:51:0x013c, B:52:0x0158, B:53:0x016b, B:76:0x01f2, B:77:0x020f, B:78:0x0210, B:79:0x022d, B:80:0x022e), top: B:88:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0249 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ahn C(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul.C(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):ahn");
    }

    public static int D(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static Shader.TileMode E(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static List F(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(J(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(J(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void G(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int H(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int iMyUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            iNoteProxyOpNoThrow = qy.x(appOpsManager, strPermissionToOp, Binder.getCallingUid(), packageName);
            if (iNoteProxyOpNoThrow == 0) {
                iNoteProxyOpNoThrow = qy.x(appOpsManager, strPermissionToOp, iMyUid, context.getOpPackageName());
            }
        } else {
            iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
        }
        return iNoteProxyOpNoThrow != 0 ? -2 : 0;
    }

    private static void I(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new sb(c, fArr));
    }

    private static List J(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void b(View view) {
        view.requestApplyInsets();
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof tx) {
            ((tx) viewParent).d(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.y(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof ty) {
            ((ty) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof tx) {
            ((tx) viewParent).e(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.y(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof tx) {
            ((tx) viewParent).g(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.y(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void f(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof tx) {
            ((tx) viewParent).h(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.y(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean g(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.y(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean h(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.y(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    public static boolean i(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof tx) {
            return ((tx) viewParent).t(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.y(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), e);
            return false;
        }
    }

    public static boolean j(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static boolean k(tt ttVar, KeyEvent keyEvent) {
        if (ttVar == null) {
            return false;
        }
        return ttVar.f(keyEvent);
    }

    public static /* synthetic */ List l(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void m(sb[] sbVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        sb sbVar;
        int i3;
        char c;
        int i4;
        float f;
        boolean z;
        float f2;
        float f3;
        sb sbVar2;
        boolean z2;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z3;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        sb[] sbVarArr2 = sbVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = sbVarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c2 = 'm';
        while (i6 < length) {
            sb sbVar3 = sbVarArr2[i6];
            char c3 = sbVar3.a;
            float[] fArr3 = sbVar3.b;
            float f15 = fArr2[i5];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            int i7 = i5;
            float f20 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_1 /* 104 */:
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case AIFeature.Id.LLM_IT_PER_LAYER_GEM /* 108 */:
                case AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_1 /* 109 */:
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i8;
                    sbVar = sbVar3;
                    float f25 = f23;
                    float f26 = f24;
                    i3 = i6;
                    c = c3;
                    int i9 = i2 + 6;
                    int i10 = i2 + 5;
                    int i11 = i2 + 4;
                    float f27 = fArr[i10];
                    float f28 = fArr[i9];
                    float f29 = fArr[i2];
                    float f30 = fArr[i2 + 1];
                    float f31 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        i4 = i11;
                        f = f30;
                        z = 1;
                    } else {
                        i4 = i11;
                        f = f30;
                        z = i7;
                    }
                    sb.a(path, f25, f26, f27, f28, f29, f, f31, z, fArr[i4] != 0.0f ? 1 : i7);
                    f17 = fArr[i10];
                    f2 = fArr[i9];
                    f18 = f2;
                    f3 = f17;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    sbVar = sbVar3;
                    c = c3;
                    int i12 = i2 + 5;
                    int i13 = i2 + 4;
                    int i14 = i2 + 3;
                    int i15 = i2 + 2;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i15], fArr[i14], fArr[i13], fArr[i12]);
                    float f32 = fArr[i13];
                    float f33 = fArr[i12];
                    f17 = fArr[i15];
                    f18 = fArr[i14];
                    f2 = f33;
                    f3 = f32;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i8;
                    sbVar = sbVar3;
                    c = c3;
                    f2 = f24;
                    i3 = i6;
                    path2.lineTo(fArr[i2], f2);
                    f3 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    sbVar = sbVar3;
                    c = c3;
                    int i16 = i2 + 3;
                    int i17 = i2 + 2;
                    int i18 = i2 + 1;
                    path2.quadTo(fArr[i2], fArr[i18], fArr[i17], fArr[i16]);
                    float f34 = fArr[i2];
                    float f35 = fArr[i18];
                    f3 = fArr[i17];
                    f18 = f35;
                    f2 = fArr[i16];
                    f17 = f34;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i8;
                    i3 = i6;
                    sbVar = sbVar3;
                    f3 = f23;
                    c = c3;
                    path2.lineTo(f3, fArr[i2]);
                    f2 = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i8;
                        int i19 = i2 + 5;
                        int i20 = i2 + 4;
                        int i21 = i2 + 3;
                        int i22 = i2 + 2;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i22], fArr[i21], fArr[i20], fArr[i19]);
                        float f36 = fArr[i22] + f23;
                        float f37 = fArr[i21] + f24;
                        f23 += fArr[i20];
                        f24 += fArr[i19];
                        f17 = f36;
                        f18 = f37;
                    } else if (c3 == 'h') {
                        fArr = fArr3;
                        i2 = i8;
                        path2.rLineTo(fArr[i2], 0.0f);
                        f23 += fArr[i2];
                    } else if (c3 != 'q') {
                        if (c3 != 'v') {
                            if (c3 != 'L') {
                                if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    f9 = fArr[i2];
                                    f10 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f9, f10);
                                    } else {
                                        path2.moveTo(f9, f10);
                                        f21 = f9;
                                        f2 = f10;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                        f3 = f21;
                                    }
                                } else if (c3 == 'S') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i23 = i2 + 3;
                                    int i24 = i2 + 2;
                                    int i25 = i2 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f23 = (f23 + f23) - f17;
                                        f24 = (f24 + f24) - f18;
                                    }
                                    path2.cubicTo(f23, f24, fArr[i2], fArr[i25], fArr[i24], fArr[i23]);
                                    f17 = fArr[i2];
                                    f18 = fArr[i25];
                                    f3 = fArr[i24];
                                    i3 = i6;
                                    c = c3;
                                    f2 = fArr[i23];
                                } else if (c3 == 'T') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i26 = i2 + 1;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f23 = (f23 + f23) - f17;
                                        f24 = (f24 + f24) - f18;
                                    }
                                    path2.quadTo(f23, f24, fArr[i2], fArr[i26]);
                                    float f38 = fArr[i2];
                                    f2 = fArr[i26];
                                    f17 = f23;
                                    f18 = f24;
                                    f3 = f38;
                                    i3 = i6;
                                    sbVar = sbVar3;
                                    c = c3;
                                } else if (c3 == 'l') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    int i27 = i2 + 1;
                                    path2.rLineTo(fArr[i2], fArr[i27]);
                                    f23 += fArr[i2];
                                    f8 = fArr[i27];
                                } else if (c3 == 'm') {
                                    fArr = fArr3;
                                    i2 = i8;
                                    float f39 = fArr[i2];
                                    f23 += f39;
                                    float f40 = fArr[i2 + 1];
                                    f24 += f40;
                                    if (i2 > 0) {
                                        path2.rLineTo(f39, f40);
                                    } else {
                                        path2.rMoveTo(f39, f40);
                                        sbVar = sbVar3;
                                        f3 = f23;
                                        f21 = f3;
                                        f2 = f24;
                                        f22 = f2;
                                        i3 = i6;
                                        c = c3;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 == 't') {
                                        int i28 = i8 + 1;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f13 = f24 - f18;
                                            f14 = f23 - f17;
                                        } else {
                                            f13 = 0.0f;
                                            f14 = 0.0f;
                                        }
                                        path2.rQuadTo(f14, f13, fArr3[i8], fArr3[i28]);
                                        float f41 = f14 + f23;
                                        float f42 = f13 + f24;
                                        f23 += fArr3[i8];
                                        f24 += fArr3[i28];
                                        f18 = f42;
                                        f17 = f41;
                                    }
                                    fArr = fArr3;
                                    i2 = i8;
                                    sbVar = sbVar3;
                                    f3 = f23;
                                    f2 = f24;
                                    i3 = i6;
                                    c = c3;
                                } else {
                                    int i29 = i8 + 3;
                                    int i30 = i8 + 2;
                                    int i31 = i8 + 1;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f11 = f24 - f18;
                                        f12 = f23 - f17;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i32 = i8;
                                    fArr = fArr3;
                                    i2 = i32;
                                    path2.rCubicTo(f12, f11, fArr3[i32], fArr3[i31], fArr3[i30], fArr3[i29]);
                                    float f43 = fArr[i2] + f23;
                                    float f44 = fArr[i31] + f24;
                                    f23 += fArr[i30];
                                    f24 += fArr[i29];
                                    f17 = f43;
                                    f18 = f44;
                                }
                                sbVar = sbVar3;
                            } else {
                                fArr = fArr3;
                                i2 = i8;
                                int i33 = i2 + 1;
                                path2.lineTo(fArr[i2], fArr[i33]);
                                f9 = fArr[i2];
                                f10 = fArr[i33];
                            }
                            f2 = f10;
                            i3 = i6;
                            c = c3;
                            f3 = f9;
                            sbVar = sbVar3;
                        } else {
                            fArr = fArr3;
                            i2 = i8;
                            path2.rLineTo(0.0f, fArr[i2]);
                            f8 = fArr[i2];
                        }
                        f24 += f8;
                    } else {
                        fArr = fArr3;
                        i2 = i8;
                        int i34 = i2 + 3;
                        int i35 = i2 + 2;
                        int i36 = i2 + 1;
                        path2.rQuadTo(fArr[i2], fArr[i36], fArr[i35], fArr[i34]);
                        float f45 = fArr[i2] + f23;
                        float f46 = fArr[i36] + f24;
                        f23 += fArr[i35];
                        f24 += fArr[i34];
                        f18 = f46;
                        f17 = f45;
                    }
                    sbVar = sbVar3;
                    f3 = f23;
                    f2 = f24;
                    i3 = i6;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i8;
                    int i37 = i2 + 6;
                    int i38 = i2 + 5;
                    int i39 = i2 + 4;
                    float f47 = fArr[i38] + f23;
                    float f48 = fArr[i37] + f24;
                    float f49 = fArr[i2];
                    float f50 = fArr[i2 + 1];
                    float f51 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        sbVar2 = sbVar3;
                        z2 = 1;
                    } else {
                        sbVar2 = sbVar3;
                        z2 = i7;
                    }
                    if (fArr[i39] != 0.0f) {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = 1;
                    } else {
                        f4 = f50;
                        f5 = f24;
                        i3 = i6;
                        f6 = f51;
                        f7 = f23;
                        c = c3;
                        z3 = i7;
                    }
                    sbVar = sbVar2;
                    sb.a(path, f7, f5, f47, f48, f49, f4, f6, z2, z3);
                    f3 = f7 + fArr[i38];
                    f2 = f5 + fArr[i37];
                    f17 = f3;
                    f18 = f2;
                }
                i8 = i2 + i;
                path2 = path;
                sbVar3 = sbVar;
                c3 = c;
                i6 = i3;
                f23 = f3;
                f24 = f2;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i7] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            c2 = sbVar3.a;
            i6++;
            sbVarArr2 = sbVarArr;
            path2 = path;
            i5 = i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0 A[Catch: NumberFormatException -> 0x00e5, LOOP:3: B:32:0x008a->B:53:0x00c0, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00e5, blocks: (B:29:0x0070, B:31:0x0083, B:32:0x008a, B:34:0x0090, B:38:0x009c, B:53:0x00c0, B:42:0x00a6, B:46:0x00b2, B:54:0x00c3, B:56:0x00c7, B:57:0x00d4, B:60:0x00da, B:62:0x00de), top: B:70:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7 A[Catch: NumberFormatException -> 0x00e5, TryCatch #0 {NumberFormatException -> 0x00e5, blocks: (B:29:0x0070, B:31:0x0083, B:32:0x008a, B:34:0x0090, B:38:0x009c, B:53:0x00c0, B:42:0x00a6, B:46:0x00b2, B:54:0x00c3, B:56:0x00c7, B:57:0x00d4, B:60:0x00da, B:62:0x00de), top: B:70:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da A[Catch: NumberFormatException -> 0x00e5, TryCatch #0 {NumberFormatException -> 0x00e5, blocks: (B:29:0x0070, B:31:0x0083, B:32:0x008a, B:34:0x0090, B:38:0x009c, B:53:0x00c0, B:42:0x00a6, B:46:0x00b2, B:54:0x00c3, B:56:0x00c7, B:57:0x00d4, B:60:0x00da, B:62:0x00de), top: B:70:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.sb[] n(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul.n(java.lang.String):sb[]");
    }

    public static sb[] o(sb[] sbVarArr) {
        sb[] sbVarArr2 = new sb[sbVarArr.length];
        for (int i = 0; i < sbVarArr.length; i++) {
            sbVarArr2[i] = new sb(sbVarArr[i]);
        }
        return sbVarArr2;
    }

    public static float[] p(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static float q(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !y(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int r(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int s(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !y(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int t(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray u(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence v(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String w(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean x(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] z(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }
}
