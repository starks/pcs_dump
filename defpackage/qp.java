package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qp {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private final HashMap f = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        int[] iArr = qu.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(AIFeature.Id.LLM_PER_LAYER_GEM, 6);
        sparseIntArray.append(AIFeature.Id.RECORDER_SUMMARIZATION_PER_LAYER_GEM, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_2, 13);
        sparseIntArray.append(AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_1, 16);
        sparseIntArray.append(AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_2, 14);
        sparseIntArray.append(AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_1, 11);
        sparseIntArray.append(AIFeature.Id.LLM_IT_PER_LAYER_GEM, 15);
        sparseIntArray.append(AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_1, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(AIFeature.Id.BUMBLEBEE, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_1, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_2, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_2, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(AIFeature.Id.MESSAGES_MAGICREWRITE_PER_LAYER_GEM_1, 83);
        sparseIntArray2.append(AIFeature.Id.GBOARD_SMARTREPLY_PER_LAYER_GEM, 84);
        sparseIntArray2.append(AIFeature.Id.RECORDER_SUMMARIZATION_PER_LAYER_GEM, 85);
        sparseIntArray2.append(AIFeature.Id.LLM_PER_LAYER_GEM, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void e(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp.e(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void f(qf qfVar, String str) {
        int i;
        int i2 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                i = iIndexOf + 1;
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                }
                i2 = i;
            } else {
                String strSubstring3 = str.substring(i, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f > 0.0f && f2 > 0.0f) {
                        fAbs = i == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
                i2 = i;
            }
        }
        qfVar.I = str;
        qfVar.J = fAbs;
        qfVar.K = i2;
    }

    private static void h(qk qkVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        qj qjVar = new qj();
        qkVar.g = qjVar;
        qkVar.c.b = false;
        qkVar.d.c = false;
        qkVar.b.a = false;
        qkVar.e.b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (e.get(index)) {
                case 2:
                    qjVar.b(2, typedArray.getDimensionPixelSize(index, qkVar.d.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", j(index, "Unknown attribute 0x", d));
                    break;
                case 5:
                    qjVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    qjVar.b(6, typedArray.getDimensionPixelOffset(index, qkVar.d.E));
                    break;
                case 7:
                    qjVar.b(7, typedArray.getDimensionPixelOffset(index, qkVar.d.F));
                    break;
                case 8:
                    qjVar.b(8, typedArray.getDimensionPixelSize(index, qkVar.d.L));
                    break;
                case 11:
                    qjVar.b(11, typedArray.getDimensionPixelSize(index, qkVar.d.R));
                    break;
                case 12:
                    qjVar.b(12, typedArray.getDimensionPixelSize(index, qkVar.d.S));
                    break;
                case 13:
                    qjVar.b(13, typedArray.getDimensionPixelSize(index, qkVar.d.O));
                    break;
                case 14:
                    qjVar.b(14, typedArray.getDimensionPixelSize(index, qkVar.d.Q));
                    break;
                case 15:
                    qjVar.b(15, typedArray.getDimensionPixelSize(index, qkVar.d.T));
                    break;
                case 16:
                    qjVar.b(16, typedArray.getDimensionPixelSize(index, qkVar.d.P));
                    break;
                case 17:
                    qjVar.b(17, typedArray.getDimensionPixelOffset(index, qkVar.d.f));
                    break;
                case 18:
                    qjVar.b(18, typedArray.getDimensionPixelOffset(index, qkVar.d.g));
                    break;
                case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                    qjVar.a(19, typedArray.getFloat(index, qkVar.d.h));
                    break;
                case 20:
                    qjVar.a(20, typedArray.getFloat(index, qkVar.d.y));
                    break;
                case 21:
                    qjVar.b(21, typedArray.getLayoutDimension(index, qkVar.d.e));
                    break;
                case 22:
                    qjVar.b(22, a[typedArray.getInt(index, qkVar.b.b)]);
                    break;
                case 23:
                    qjVar.b(23, typedArray.getLayoutDimension(index, qkVar.d.d));
                    break;
                case 24:
                    qjVar.b(24, typedArray.getDimensionPixelSize(index, qkVar.d.H));
                    break;
                case 27:
                    qjVar.b(27, typedArray.getInt(index, qkVar.d.G));
                    break;
                case 28:
                    qjVar.b(28, typedArray.getDimensionPixelSize(index, qkVar.d.I));
                    break;
                case 31:
                    qjVar.b(31, typedArray.getDimensionPixelSize(index, qkVar.d.M));
                    break;
                case 34:
                    qjVar.b(34, typedArray.getDimensionPixelSize(index, qkVar.d.J));
                    break;
                case 37:
                    qjVar.a(37, typedArray.getFloat(index, qkVar.d.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, qkVar.a);
                    qkVar.a = resourceId;
                    qjVar.b(38, resourceId);
                    break;
                case 39:
                    qjVar.a(39, typedArray.getFloat(index, qkVar.d.W));
                    break;
                case 40:
                    qjVar.a(40, typedArray.getFloat(index, qkVar.d.V));
                    break;
                case 41:
                    qjVar.b(41, typedArray.getInt(index, qkVar.d.X));
                    break;
                case 42:
                    qjVar.b(42, typedArray.getInt(index, qkVar.d.Y));
                    break;
                case 43:
                    qjVar.a(43, typedArray.getFloat(index, qkVar.b.d));
                    break;
                case 44:
                    qjVar.d(44, true);
                    qjVar.a(44, typedArray.getDimension(index, qkVar.e.o));
                    break;
                case 45:
                    qjVar.a(45, typedArray.getFloat(index, qkVar.e.d));
                    break;
                case 46:
                    qjVar.a(46, typedArray.getFloat(index, qkVar.e.e));
                    break;
                case 47:
                    qjVar.a(47, typedArray.getFloat(index, qkVar.e.f));
                    break;
                case 48:
                    qjVar.a(48, typedArray.getFloat(index, qkVar.e.g));
                    break;
                case 49:
                    qjVar.a(49, typedArray.getDimension(index, qkVar.e.h));
                    break;
                case 50:
                    qjVar.a(50, typedArray.getDimension(index, qkVar.e.i));
                    break;
                case 51:
                    qjVar.a(51, typedArray.getDimension(index, qkVar.e.k));
                    break;
                case 52:
                    qjVar.a(52, typedArray.getDimension(index, qkVar.e.l));
                    break;
                case 53:
                    qjVar.a(53, typedArray.getDimension(index, qkVar.e.m));
                    break;
                case 54:
                    qjVar.b(54, typedArray.getInt(index, qkVar.d.Z));
                    break;
                case 55:
                    qjVar.b(55, typedArray.getInt(index, qkVar.d.aa));
                    break;
                case 56:
                    qjVar.b(56, typedArray.getDimensionPixelSize(index, qkVar.d.ab));
                    break;
                case 57:
                    qjVar.b(57, typedArray.getDimensionPixelSize(index, qkVar.d.ac));
                    break;
                case 58:
                    qjVar.b(58, typedArray.getDimensionPixelSize(index, qkVar.d.ad));
                    break;
                case 59:
                    qjVar.b(59, typedArray.getDimensionPixelSize(index, qkVar.d.ae));
                    break;
                case 60:
                    qjVar.a(60, typedArray.getFloat(index, qkVar.e.c));
                    break;
                case 62:
                    qjVar.b(62, typedArray.getDimensionPixelSize(index, qkVar.d.C));
                    break;
                case 63:
                    qjVar.a(63, typedArray.getFloat(index, qkVar.d.D));
                    break;
                case 64:
                    qjVar.b(64, a(typedArray, index, qkVar.c.c));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        qjVar.c(65, typedArray.getString(index));
                        break;
                    } else {
                        qjVar.c(65, pc.a[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    qjVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    qjVar.a(67, typedArray.getFloat(index, qkVar.c.j));
                    break;
                case 68:
                    qjVar.a(68, typedArray.getFloat(index, qkVar.b.e));
                    break;
                case 69:
                    qjVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    qjVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    qjVar.b(72, typedArray.getInt(index, qkVar.d.ah));
                    break;
                case 73:
                    qjVar.b(73, typedArray.getDimensionPixelSize(index, qkVar.d.ai));
                    break;
                case 74:
                    qjVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    qjVar.d(75, typedArray.getBoolean(index, qkVar.d.ap));
                    break;
                case 76:
                    qjVar.b(76, typedArray.getInt(index, qkVar.c.f));
                    break;
                case 77:
                    qjVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    qjVar.b(78, typedArray.getInt(index, qkVar.b.c));
                    break;
                case 79:
                    qjVar.a(79, typedArray.getFloat(index, qkVar.c.h));
                    break;
                case 80:
                    qjVar.d(80, typedArray.getBoolean(index, qkVar.d.an));
                    break;
                case 81:
                    qjVar.d(81, typedArray.getBoolean(index, qkVar.d.ao));
                    break;
                case 82:
                    qjVar.b(82, typedArray.getInteger(index, qkVar.c.d));
                    break;
                case 83:
                    qjVar.b(83, a(typedArray, index, qkVar.e.j));
                    break;
                case 84:
                    qjVar.b(84, typedArray.getInteger(index, qkVar.c.l));
                    break;
                case 85:
                    qjVar.a(85, typedArray.getFloat(index, qkVar.c.k));
                    break;
                case 86:
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        qkVar.c.o = typedArray.getResourceId(index, -1);
                        qjVar.b(89, qkVar.c.o);
                        qm qmVar = qkVar.c;
                        if (qmVar.o != -1) {
                            qmVar.n = -2;
                            qjVar.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        qkVar.c.m = typedArray.getString(index);
                        qjVar.c(90, qkVar.c.m);
                        if (qkVar.c.m.indexOf("/") > 0) {
                            qkVar.c.o = typedArray.getResourceId(index, -1);
                            qjVar.b(89, qkVar.c.o);
                            qkVar.c.n = -2;
                            qjVar.b(88, -2);
                            break;
                        } else {
                            qkVar.c.n = -1;
                            qjVar.b(88, -1);
                            break;
                        }
                    } else {
                        qm qmVar2 = qkVar.c;
                        qmVar2.n = typedArray.getInteger(index, qmVar2.o);
                        qjVar.b(88, qkVar.c.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", j(index, "unused attribute 0x", d));
                    break;
                case 93:
                    qjVar.b(93, typedArray.getDimensionPixelSize(index, qkVar.d.N));
                    break;
                case 94:
                    qjVar.b(94, typedArray.getDimensionPixelSize(index, qkVar.d.U));
                    break;
                case 95:
                    e(qjVar, typedArray, index, 0);
                    break;
                case 96:
                    e(qjVar, typedArray, index, 1);
                    break;
                case 97:
                    qjVar.b(97, typedArray.getInt(index, qkVar.d.aq));
                    break;
                case 98:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    } else {
                        qkVar.a = typedArray.getResourceId(index, qkVar.a);
                        break;
                    }
                case 99:
                    qjVar.d(99, typedArray.getBoolean(index, qkVar.d.i));
                    break;
            }
        }
    }

    private static final qk i(Context context, AttributeSet attributeSet, boolean z) {
        qk qkVar = new qk();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? qu.c : qu.a);
        if (z) {
            h(qkVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    qkVar.c.b = true;
                    qkVar.d.c = true;
                    qkVar.b.a = true;
                    qkVar.e.b = true;
                }
                SparseIntArray sparseIntArray = d;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        ql qlVar = qkVar.d;
                        qlVar.r = a(typedArrayObtainStyledAttributes, index, qlVar.r);
                        break;
                    case 2:
                        ql qlVar2 = qkVar.d;
                        qlVar2.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar2.K);
                        break;
                    case 3:
                        ql qlVar3 = qkVar.d;
                        qlVar3.q = a(typedArrayObtainStyledAttributes, index, qlVar3.q);
                        break;
                    case 4:
                        ql qlVar4 = qkVar.d;
                        qlVar4.p = a(typedArrayObtainStyledAttributes, index, qlVar4.p);
                        break;
                    case 5:
                        qkVar.d.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        ql qlVar5 = qkVar.d;
                        qlVar5.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, qlVar5.E);
                        break;
                    case 7:
                        ql qlVar6 = qkVar.d;
                        qlVar6.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, qlVar6.F);
                        break;
                    case 8:
                        ql qlVar7 = qkVar.d;
                        qlVar7.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar7.L);
                        break;
                    case 9:
                        ql qlVar8 = qkVar.d;
                        qlVar8.x = a(typedArrayObtainStyledAttributes, index, qlVar8.x);
                        break;
                    case 10:
                        ql qlVar9 = qkVar.d;
                        qlVar9.w = a(typedArrayObtainStyledAttributes, index, qlVar9.w);
                        break;
                    case 11:
                        ql qlVar10 = qkVar.d;
                        qlVar10.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar10.R);
                        break;
                    case 12:
                        ql qlVar11 = qkVar.d;
                        qlVar11.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar11.S);
                        break;
                    case 13:
                        ql qlVar12 = qkVar.d;
                        qlVar12.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar12.O);
                        break;
                    case 14:
                        ql qlVar13 = qkVar.d;
                        qlVar13.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar13.Q);
                        break;
                    case 15:
                        ql qlVar14 = qkVar.d;
                        qlVar14.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar14.T);
                        break;
                    case 16:
                        ql qlVar15 = qkVar.d;
                        qlVar15.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar15.P);
                        break;
                    case 17:
                        ql qlVar16 = qkVar.d;
                        qlVar16.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, qlVar16.f);
                        break;
                    case 18:
                        ql qlVar17 = qkVar.d;
                        qlVar17.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, qlVar17.g);
                        break;
                    case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                        ql qlVar18 = qkVar.d;
                        qlVar18.h = typedArrayObtainStyledAttributes.getFloat(index, qlVar18.h);
                        break;
                    case 20:
                        ql qlVar19 = qkVar.d;
                        qlVar19.y = typedArrayObtainStyledAttributes.getFloat(index, qlVar19.y);
                        break;
                    case 21:
                        ql qlVar20 = qkVar.d;
                        qlVar20.e = typedArrayObtainStyledAttributes.getLayoutDimension(index, qlVar20.e);
                        break;
                    case 22:
                        qn qnVar = qkVar.b;
                        qnVar.b = typedArrayObtainStyledAttributes.getInt(index, qnVar.b);
                        qn qnVar2 = qkVar.b;
                        qnVar2.b = a[qnVar2.b];
                        break;
                    case 23:
                        ql qlVar21 = qkVar.d;
                        qlVar21.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, qlVar21.d);
                        break;
                    case 24:
                        ql qlVar22 = qkVar.d;
                        qlVar22.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar22.H);
                        break;
                    case 25:
                        ql qlVar23 = qkVar.d;
                        qlVar23.j = a(typedArrayObtainStyledAttributes, index, qlVar23.j);
                        break;
                    case 26:
                        ql qlVar24 = qkVar.d;
                        qlVar24.k = a(typedArrayObtainStyledAttributes, index, qlVar24.k);
                        break;
                    case 27:
                        ql qlVar25 = qkVar.d;
                        qlVar25.G = typedArrayObtainStyledAttributes.getInt(index, qlVar25.G);
                        break;
                    case 28:
                        ql qlVar26 = qkVar.d;
                        qlVar26.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar26.I);
                        break;
                    case 29:
                        ql qlVar27 = qkVar.d;
                        qlVar27.l = a(typedArrayObtainStyledAttributes, index, qlVar27.l);
                        break;
                    case 30:
                        ql qlVar28 = qkVar.d;
                        qlVar28.m = a(typedArrayObtainStyledAttributes, index, qlVar28.m);
                        break;
                    case 31:
                        ql qlVar29 = qkVar.d;
                        qlVar29.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar29.M);
                        break;
                    case 32:
                        ql qlVar30 = qkVar.d;
                        qlVar30.u = a(typedArrayObtainStyledAttributes, index, qlVar30.u);
                        break;
                    case 33:
                        ql qlVar31 = qkVar.d;
                        qlVar31.v = a(typedArrayObtainStyledAttributes, index, qlVar31.v);
                        break;
                    case 34:
                        ql qlVar32 = qkVar.d;
                        qlVar32.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar32.J);
                        break;
                    case 35:
                        ql qlVar33 = qkVar.d;
                        qlVar33.o = a(typedArrayObtainStyledAttributes, index, qlVar33.o);
                        break;
                    case 36:
                        ql qlVar34 = qkVar.d;
                        qlVar34.n = a(typedArrayObtainStyledAttributes, index, qlVar34.n);
                        break;
                    case 37:
                        ql qlVar35 = qkVar.d;
                        qlVar35.z = typedArrayObtainStyledAttributes.getFloat(index, qlVar35.z);
                        break;
                    case 38:
                        qkVar.a = typedArrayObtainStyledAttributes.getResourceId(index, qkVar.a);
                        break;
                    case 39:
                        ql qlVar36 = qkVar.d;
                        qlVar36.W = typedArrayObtainStyledAttributes.getFloat(index, qlVar36.W);
                        break;
                    case 40:
                        ql qlVar37 = qkVar.d;
                        qlVar37.V = typedArrayObtainStyledAttributes.getFloat(index, qlVar37.V);
                        break;
                    case 41:
                        ql qlVar38 = qkVar.d;
                        qlVar38.X = typedArrayObtainStyledAttributes.getInt(index, qlVar38.X);
                        break;
                    case 42:
                        ql qlVar39 = qkVar.d;
                        qlVar39.Y = typedArrayObtainStyledAttributes.getInt(index, qlVar39.Y);
                        break;
                    case 43:
                        qn qnVar3 = qkVar.b;
                        qnVar3.d = typedArrayObtainStyledAttributes.getFloat(index, qnVar3.d);
                        break;
                    case 44:
                        qo qoVar = qkVar.e;
                        qoVar.n = true;
                        qoVar.o = typedArrayObtainStyledAttributes.getDimension(index, qoVar.o);
                        break;
                    case 45:
                        qo qoVar2 = qkVar.e;
                        qoVar2.d = typedArrayObtainStyledAttributes.getFloat(index, qoVar2.d);
                        break;
                    case 46:
                        qo qoVar3 = qkVar.e;
                        qoVar3.e = typedArrayObtainStyledAttributes.getFloat(index, qoVar3.e);
                        break;
                    case 47:
                        qo qoVar4 = qkVar.e;
                        qoVar4.f = typedArrayObtainStyledAttributes.getFloat(index, qoVar4.f);
                        break;
                    case 48:
                        qo qoVar5 = qkVar.e;
                        qoVar5.g = typedArrayObtainStyledAttributes.getFloat(index, qoVar5.g);
                        break;
                    case 49:
                        qo qoVar6 = qkVar.e;
                        qoVar6.h = typedArrayObtainStyledAttributes.getDimension(index, qoVar6.h);
                        break;
                    case 50:
                        qo qoVar7 = qkVar.e;
                        qoVar7.i = typedArrayObtainStyledAttributes.getDimension(index, qoVar7.i);
                        break;
                    case 51:
                        qo qoVar8 = qkVar.e;
                        qoVar8.k = typedArrayObtainStyledAttributes.getDimension(index, qoVar8.k);
                        break;
                    case 52:
                        qo qoVar9 = qkVar.e;
                        qoVar9.l = typedArrayObtainStyledAttributes.getDimension(index, qoVar9.l);
                        break;
                    case 53:
                        qo qoVar10 = qkVar.e;
                        qoVar10.m = typedArrayObtainStyledAttributes.getDimension(index, qoVar10.m);
                        break;
                    case 54:
                        ql qlVar40 = qkVar.d;
                        qlVar40.Z = typedArrayObtainStyledAttributes.getInt(index, qlVar40.Z);
                        break;
                    case 55:
                        ql qlVar41 = qkVar.d;
                        qlVar41.aa = typedArrayObtainStyledAttributes.getInt(index, qlVar41.aa);
                        break;
                    case 56:
                        ql qlVar42 = qkVar.d;
                        qlVar42.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar42.ab);
                        break;
                    case 57:
                        ql qlVar43 = qkVar.d;
                        qlVar43.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar43.ac);
                        break;
                    case 58:
                        ql qlVar44 = qkVar.d;
                        qlVar44.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar44.ad);
                        break;
                    case 59:
                        ql qlVar45 = qkVar.d;
                        qlVar45.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar45.ae);
                        break;
                    case 60:
                        qo qoVar11 = qkVar.e;
                        qoVar11.c = typedArrayObtainStyledAttributes.getFloat(index, qoVar11.c);
                        break;
                    case 61:
                        ql qlVar46 = qkVar.d;
                        qlVar46.B = a(typedArrayObtainStyledAttributes, index, qlVar46.B);
                        break;
                    case 62:
                        ql qlVar47 = qkVar.d;
                        qlVar47.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar47.C);
                        break;
                    case 63:
                        ql qlVar48 = qkVar.d;
                        qlVar48.D = typedArrayObtainStyledAttributes.getFloat(index, qlVar48.D);
                        break;
                    case 64:
                        qm qmVar = qkVar.c;
                        qmVar.c = a(typedArrayObtainStyledAttributes, index, qmVar.c);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            qkVar.c.e = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            qkVar.c.e = pc.a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        qkVar.c.g = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        qm qmVar2 = qkVar.c;
                        qmVar2.j = typedArrayObtainStyledAttributes.getFloat(index, qmVar2.j);
                        break;
                    case 68:
                        qn qnVar4 = qkVar.b;
                        qnVar4.e = typedArrayObtainStyledAttributes.getFloat(index, qnVar4.e);
                        break;
                    case 69:
                        qkVar.d.af = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        qkVar.d.ag = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        ql qlVar49 = qkVar.d;
                        qlVar49.ah = typedArrayObtainStyledAttributes.getInt(index, qlVar49.ah);
                        break;
                    case 73:
                        ql qlVar50 = qkVar.d;
                        qlVar50.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar50.ai);
                        break;
                    case 74:
                        qkVar.d.al = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        ql qlVar51 = qkVar.d;
                        qlVar51.ap = typedArrayObtainStyledAttributes.getBoolean(index, qlVar51.ap);
                        break;
                    case 76:
                        qm qmVar3 = qkVar.c;
                        qmVar3.f = typedArrayObtainStyledAttributes.getInt(index, qmVar3.f);
                        break;
                    case 77:
                        qkVar.d.am = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        qn qnVar5 = qkVar.b;
                        qnVar5.c = typedArrayObtainStyledAttributes.getInt(index, qnVar5.c);
                        break;
                    case 79:
                        qm qmVar4 = qkVar.c;
                        qmVar4.h = typedArrayObtainStyledAttributes.getFloat(index, qmVar4.h);
                        break;
                    case 80:
                        ql qlVar52 = qkVar.d;
                        qlVar52.an = typedArrayObtainStyledAttributes.getBoolean(index, qlVar52.an);
                        break;
                    case 81:
                        ql qlVar53 = qkVar.d;
                        qlVar53.ao = typedArrayObtainStyledAttributes.getBoolean(index, qlVar53.ao);
                        break;
                    case 82:
                        qm qmVar5 = qkVar.c;
                        qmVar5.d = typedArrayObtainStyledAttributes.getInteger(index, qmVar5.d);
                        break;
                    case 83:
                        qo qoVar12 = qkVar.e;
                        qoVar12.j = a(typedArrayObtainStyledAttributes, index, qoVar12.j);
                        break;
                    case 84:
                        qm qmVar6 = qkVar.c;
                        qmVar6.l = typedArrayObtainStyledAttributes.getInteger(index, qmVar6.l);
                        break;
                    case 85:
                        qm qmVar7 = qkVar.c;
                        qmVar7.k = typedArrayObtainStyledAttributes.getFloat(index, qmVar7.k);
                        break;
                    case 86:
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        if (typedValuePeekValue.type == 1) {
                            qkVar.c.o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            qm qmVar8 = qkVar.c;
                            if (qmVar8.o != -1) {
                                qmVar8.n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            qkVar.c.m = typedArrayObtainStyledAttributes.getString(index);
                            if (qkVar.c.m.indexOf("/") > 0) {
                                qkVar.c.o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                qkVar.c.n = -2;
                                break;
                            } else {
                                qkVar.c.n = -1;
                                break;
                            }
                        } else {
                            qm qmVar9 = qkVar.c;
                            qmVar9.n = typedArrayObtainStyledAttributes.getInteger(index, qmVar9.o);
                            break;
                        }
                    case 87:
                        Log.w("ConstraintSet", j(index, "unused attribute 0x", sparseIntArray));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", j(index, "Unknown attribute 0x", sparseIntArray));
                        break;
                    case 91:
                        ql qlVar54 = qkVar.d;
                        qlVar54.s = a(typedArrayObtainStyledAttributes, index, qlVar54.s);
                        break;
                    case 92:
                        ql qlVar55 = qkVar.d;
                        qlVar55.t = a(typedArrayObtainStyledAttributes, index, qlVar55.t);
                        break;
                    case 93:
                        ql qlVar56 = qkVar.d;
                        qlVar56.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar56.N);
                        break;
                    case 94:
                        ql qlVar57 = qkVar.d;
                        qlVar57.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, qlVar57.U);
                        break;
                    case 95:
                        e(qkVar.d, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        e(qkVar.d, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        ql qlVar58 = qkVar.d;
                        qlVar58.aq = typedArrayObtainStyledAttributes.getInt(index, qlVar58.aq);
                        break;
                }
            }
            ql qlVar59 = qkVar.d;
            if (qlVar59.al != null) {
                qlVar59.ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return qkVar;
    }

    private static /* synthetic */ String j(int i, String str, SparseIntArray sparseIntArray) {
        return str + Integer.toHexString(i) + "   " + sparseIntArray.get(i);
    }

    public final void b(Context context, int i) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        qp qpVar = this;
        ConstraintLayout constraintLayout3 = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout3.getChildCount();
        qpVar.c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout3.getChildAt(i2);
            qf qfVar = (qf) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap map = qpVar.c;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                qpVar.c.put(numValueOf, new qk());
            }
            qk qkVar = (qk) qpVar.c.get(numValueOf);
            if (qkVar == null) {
                constraintLayout = constraintLayout3;
            } else {
                HashMap map2 = qpVar.f;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    qc qcVar = (qc) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            constraintLayout2 = constraintLayout3;
                            try {
                                map3.put(str, new qc(qcVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                constraintLayout3 = constraintLayout2;
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                constraintLayout3 = constraintLayout2;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                constraintLayout3 = constraintLayout2;
                            }
                        } else {
                            constraintLayout2 = constraintLayout3;
                            map3.put(str, new qc(qcVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        constraintLayout2 = constraintLayout3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        constraintLayout2 = constraintLayout3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        constraintLayout2 = constraintLayout3;
                    }
                    constraintLayout3 = constraintLayout2;
                }
                constraintLayout = constraintLayout3;
                qkVar.f = map3;
                qkVar.a = id;
                int i3 = qfVar.e;
                ql qlVar = qkVar.d;
                qlVar.j = i3;
                qlVar.k = qfVar.f;
                qlVar.l = qfVar.g;
                qlVar.m = qfVar.h;
                qlVar.n = qfVar.i;
                qlVar.o = qfVar.j;
                qlVar.p = qfVar.k;
                qlVar.q = qfVar.l;
                qlVar.r = qfVar.m;
                qlVar.s = qfVar.n;
                qlVar.t = qfVar.o;
                qlVar.u = qfVar.s;
                qlVar.v = qfVar.t;
                qlVar.w = qfVar.u;
                qlVar.x = qfVar.v;
                qlVar.y = qfVar.G;
                qlVar.z = qfVar.H;
                qlVar.A = qfVar.I;
                qlVar.B = qfVar.p;
                qlVar.C = qfVar.q;
                qlVar.D = qfVar.r;
                qlVar.E = qfVar.X;
                qlVar.F = qfVar.Y;
                qlVar.G = qfVar.Z;
                qlVar.h = qfVar.c;
                qlVar.f = qfVar.a;
                qlVar.g = qfVar.b;
                qlVar.d = qfVar.width;
                qkVar.d.e = qfVar.height;
                qkVar.d.H = qfVar.leftMargin;
                qkVar.d.I = qfVar.rightMargin;
                qkVar.d.J = qfVar.topMargin;
                qkVar.d.K = qfVar.bottomMargin;
                int i4 = qfVar.D;
                ql qlVar2 = qkVar.d;
                qlVar2.N = i4;
                qlVar2.V = qfVar.M;
                qlVar2.W = qfVar.L;
                qlVar2.Y = qfVar.O;
                qlVar2.X = qfVar.N;
                qlVar2.an = qfVar.aa;
                qlVar2.ao = qfVar.ab;
                qlVar2.Z = qfVar.P;
                qlVar2.aa = qfVar.Q;
                qlVar2.ab = qfVar.T;
                qlVar2.ac = qfVar.U;
                qlVar2.ad = qfVar.R;
                qlVar2.ae = qfVar.S;
                qlVar2.af = qfVar.V;
                qlVar2.ag = qfVar.W;
                qlVar2.am = qfVar.ac;
                qlVar2.P = qfVar.x;
                qlVar2.R = qfVar.z;
                qlVar2.O = qfVar.w;
                qlVar2.Q = qfVar.y;
                qlVar2.T = qfVar.A;
                qlVar2.S = qfVar.B;
                qlVar2.U = qfVar.C;
                qlVar2.aq = qfVar.ad;
                qlVar2.L = qfVar.getMarginEnd();
                qkVar.d.M = qfVar.getMarginStart();
                qkVar.b.b = childAt.getVisibility();
                qkVar.b.d = childAt.getAlpha();
                qkVar.e.c = childAt.getRotation();
                qkVar.e.d = childAt.getRotationX();
                qkVar.e.e = childAt.getRotationY();
                qkVar.e.f = childAt.getScaleX();
                qkVar.e.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    qo qoVar = qkVar.e;
                    qoVar.h = pivotX;
                    qoVar.i = pivotY;
                }
                qkVar.e.k = childAt.getTranslationX();
                qkVar.e.l = childAt.getTranslationY();
                qkVar.e.m = childAt.getTranslationZ();
                qo qoVar2 = qkVar.e;
                if (qoVar2.n) {
                    qoVar2.o = childAt.getElevation();
                }
                if (childAt instanceof qb) {
                    qb qbVar = (qb) childAt;
                    ql qlVar3 = qkVar.d;
                    qlVar3.ap = qbVar.b.b;
                    qlVar3.ak = Arrays.copyOf(qbVar.c, qbVar.d);
                    ql qlVar4 = qkVar.d;
                    qlVar4.ah = qbVar.a;
                    qlVar4.ai = qbVar.b.c;
                }
            }
            i2++;
            qpVar = this;
            constraintLayout3 = constraintLayout;
        }
    }

    public final void c(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    qk qkVarI = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        qkVarI.d.b = true;
                    }
                    this.c.put(Integer.valueOf(qkVarI.a), qkVarI);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", a.x(i, "Error parsing resource: "), e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", a.x(i, "Error parsing resource: "), e3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r21, org.xmlpull.v1.XmlPullParser r22) {
        /*
            Method dump skipped, instructions count: 2166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp.d(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final int[] g(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int length;
        int iIntValue;
        Object objE;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = qt.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objE = ((ConstraintLayout) view.getParent()).e(strTrim)) != null && (objE instanceof Integer)) ? ((Integer) objE).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? Arrays.copyOf(iArr, i2) : iArr;
    }
}
