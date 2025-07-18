package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: PG */
/* loaded from: classes.dex */
class hf {
    private static final int[] b = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Bitmap a;
    private final ProgressBar c;

    public hf(ProgressBar progressBar) {
        this.c = progressBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Drawable a(Drawable drawable, boolean z) {
        if (drawable instanceof sg) {
            sg sgVar = (sg) drawable;
            Drawable drawableA = sgVar.a();
            if (drawableA != null) {
                a(drawableA, z);
                sgVar.b();
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.a == null) {
                    this.a = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public void b(AttributeSet attributeSet, int i) {
        zw zwVarR = zw.r(this.c.getContext(), attributeSet, b, i, 0);
        Drawable drawableJ = zwVarR.j(0);
        if (drawableJ != null) {
            ProgressBar progressBar = this.c;
            if (drawableJ instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableJ;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableA = a(animationDrawable.getFrame(i2), true);
                    drawableA.setLevel(10000);
                    animationDrawable2.addFrame(drawableA, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableJ = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableJ);
        }
        Drawable drawableJ2 = zwVarR.j(1);
        if (drawableJ2 != null) {
            this.c.setProgressDrawable(a(drawableJ2, false));
        }
        zwVarR.m();
    }
}
