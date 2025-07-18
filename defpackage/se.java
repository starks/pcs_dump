package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class se extends sf {
    private static int e(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private static final Font f(FontFamily fontFamily, int i) {
        int i2 = 1;
        FontStyle fontStyle = new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iE = e(fontStyle, font.getStyle());
        while (i2 < fontFamily.getSize()) {
            Font font2 = fontFamily.getFont(i2);
            int iE2 = e(fontStyle, font2.getStyle());
            int i3 = iE2 < iE ? iE2 : iE;
            if (iE2 < iE) {
                font = font2;
            }
            i2++;
            iE = i3;
        }
        return font;
    }

    private static FontFamily g(sy[] syVarArr, ContentResolver contentResolver) throws IOException {
        FontFamily.Builder builder = null;
        for (sy syVar : syVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(syVar.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(syVar.c).setSlant(syVar.d ? 1 : 0).setTtcIndex(syVar.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    continue;
                }
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // defpackage.sf
    public final Typeface a(Context context, sy[] syVarArr, int i) {
        try {
            FontFamily fontFamilyG = g(syVarArr, context.getContentResolver());
            if (fontFamilyG == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyG).setStyle(f(fontFamilyG, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.sf
    public final Typeface b(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyG = g((sy[]) list.get(0), contentResolver);
            if (fontFamilyG == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyG);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyG2 = g((sy[]) list.get(i2), contentResolver);
                if (fontFamilyG2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyG2);
                }
            }
            return customFallbackBuilder.setStyle(f(fontFamilyG, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.sf
    public final Typeface c(Context context, Resources resources, int i) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.sf
    public final Typeface d(Context context, fsc fscVar, Resources resources, int i) throws IOException {
        try {
            Object obj = fscVar.a;
            int length = ((rs[]) obj).length;
            FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                rs rsVar = ((rs[]) obj)[i2];
                try {
                    Font fontBuild = new Font.Builder(resources, rsVar.f).setWeight(rsVar.b).setSlant(rsVar.c ? 1 : 0).setTtcIndex(rsVar.e).setFontVariationSettings(rsVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(f(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
