package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rw {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, rv rvVar, boolean z, boolean z2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceB = b(context, resources, typedValue, i, i2, rvVar, z, z2);
        if (typefaceB != null || rvVar != null || z2) {
            return typefaceB;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197 A[Catch: IOException -> 0x0315, XmlPullParserException -> 0x0317, TryCatch #9 {IOException -> 0x0315, XmlPullParserException -> 0x0317, blocks: (B:30:0x0085, B:34:0x00b0, B:36:0x00b7, B:37:0x00bb, B:39:0x00c1, B:41:0x00cb, B:84:0x0197, B:86:0x01a0, B:88:0x01a5, B:90:0x01ab, B:92:0x01b1, B:95:0x01b8, B:97:0x01c5, B:102:0x01d1, B:104:0x01d8, B:112:0x01e5, B:114:0x01e9, B:116:0x01f6, B:118:0x020b, B:120:0x0218, B:122:0x021f, B:124:0x023d, B:162:0x0309, B:126:0x0249, B:127:0x025c, B:128:0x0261, B:130:0x0270, B:131:0x027a, B:132:0x0281, B:133:0x0282, B:135:0x0291, B:136:0x029a, B:137:0x02a2, B:145:0x02c2, B:147:0x02d5, B:149:0x02e4, B:148:0x02df, B:154:0x02f1, B:117:0x0201, B:155:0x02f2, B:158:0x02fe, B:159:0x0302, B:42:0x00db, B:43:0x00e0, B:45:0x00e7, B:47:0x00ee, B:49:0x00fa, B:52:0x010e, B:56:0x011e, B:60:0x012a, B:63:0x0133, B:67:0x013c, B:71:0x014f, B:72:0x015a, B:74:0x0161, B:75:0x0165, B:76:0x0171, B:77:0x0178, B:80:0x017f, B:81:0x018e, B:138:0x02a3, B:140:0x02ad, B:141:0x02b0, B:143:0x02b4, B:144:0x02c1), top: B:205:0x0072, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5 A[Catch: IOException -> 0x0315, XmlPullParserException -> 0x0317, TryCatch #9 {IOException -> 0x0315, XmlPullParserException -> 0x0317, blocks: (B:30:0x0085, B:34:0x00b0, B:36:0x00b7, B:37:0x00bb, B:39:0x00c1, B:41:0x00cb, B:84:0x0197, B:86:0x01a0, B:88:0x01a5, B:90:0x01ab, B:92:0x01b1, B:95:0x01b8, B:97:0x01c5, B:102:0x01d1, B:104:0x01d8, B:112:0x01e5, B:114:0x01e9, B:116:0x01f6, B:118:0x020b, B:120:0x0218, B:122:0x021f, B:124:0x023d, B:162:0x0309, B:126:0x0249, B:127:0x025c, B:128:0x0261, B:130:0x0270, B:131:0x027a, B:132:0x0281, B:133:0x0282, B:135:0x0291, B:136:0x029a, B:137:0x02a2, B:145:0x02c2, B:147:0x02d5, B:149:0x02e4, B:148:0x02df, B:154:0x02f1, B:117:0x0201, B:155:0x02f2, B:158:0x02fe, B:159:0x0302, B:42:0x00db, B:43:0x00e0, B:45:0x00e7, B:47:0x00ee, B:49:0x00fa, B:52:0x010e, B:56:0x011e, B:60:0x012a, B:63:0x0133, B:67:0x013c, B:71:0x014f, B:72:0x015a, B:74:0x0161, B:75:0x0165, B:76:0x0171, B:77:0x0178, B:80:0x017f, B:81:0x018e, B:138:0x02a3, B:140:0x02ad, B:141:0x02b0, B:143:0x02b4, B:144:0x02c1), top: B:205:0x0072, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface b(android.content.Context r30, android.content.res.Resources r31, android.util.TypedValue r32, int r33, int r34, defpackage.rv r35, boolean r36, boolean r37) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.b(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, rv, boolean, boolean):android.graphics.Typeface");
    }
}
