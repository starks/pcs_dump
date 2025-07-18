package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiq extends aii {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public aio b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public aiq() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new aio();
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float fAbs = Math.abs(this.h[0]);
        float fAbs2 = Math.abs(this.h[4]);
        float fAbs3 = Math.abs(this.h[1]);
        float fAbs4 = Math.abs(this.h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(AIFeature.Id.PIXEL_AI_FEATURE_48, (int) (this.j.width() * fAbs));
        int iMin2 = Math.min(AIFeature.Id.PIXEL_AI_FEATURE_48, (int) (this.j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.j.left, this.j.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        aio aioVar = this.b;
        Bitmap bitmap = aioVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != aioVar.f.getHeight()) {
            aioVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            aioVar.k = true;
        }
        if (this.c) {
            aio aioVar2 = this.b;
            if (aioVar2.k || aioVar2.g != aioVar2.c || aioVar2.h != aioVar2.d || aioVar2.j != aioVar2.e || aioVar2.i != aioVar2.b.getRootAlpha()) {
                this.b.a(iMin, iMin2);
                aio aioVar3 = this.b;
                aioVar3.g = aioVar3.c;
                aioVar3.h = aioVar3.d;
                aioVar3.i = aioVar3.b.getRootAlpha();
                aioVar3.j = aioVar3.e;
                aioVar3.k = false;
            }
        } else {
            this.b.a(iMin, iMin2);
        }
        aio aioVar4 = this.b;
        Rect rect = this.j;
        if (aioVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (aioVar4.l == null) {
                aioVar4.l = new Paint();
                aioVar4.l.setFilterBitmap(true);
            }
            aioVar4.l.setAlpha(aioVar4.b.getRootAlpha());
            aioVar4.l.setColorFilter(colorFilter);
            paint = aioVar4.l;
        }
        canvas.drawBitmap(aioVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new aip(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        aio aioVar = this.b;
        if (aioVar == null) {
            return false;
        }
        if (aioVar.b()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new aio(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.aii, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        aio aioVar = this.b;
        ColorStateList colorStateList = aioVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = aioVar.d) != null) {
            this.d = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (aioVar.b()) {
            boolean zL = aioVar.b.d.l(iArr);
            aioVar.k |= zL;
            if (zL) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        aio aioVar = this.b;
        if (aioVar.c != colorStateList) {
            aioVar.c = colorStateList;
            this.d = b(colorStateList, aioVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        aio aioVar = this.b;
        if (aioVar.d != mode) {
            aioVar.d = mode;
            this.d = b(aioVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListA;
        int i;
        boolean z;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        aio aioVar = this.b;
        aioVar.b = new ain();
        TypedArray typedArrayU = ul.u(resources, theme, attributeSet, aia.a);
        aio aioVar2 = this.b;
        ain ainVar = aioVar2.b;
        aioVar2.d = a.c(ul.s(typedArrayU, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        boolean z2 = false;
        int i2 = 2;
        if (ul.y(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayU.getValue(1, typedValue);
            if (typedValue.type != 2) {
                if (typedValue.type >= 28 && typedValue.type <= 31) {
                    colorStateListA = ColorStateList.valueOf(typedValue.data);
                } else {
                    Resources resources2 = typedArrayU.getResources();
                    int resourceId = typedArrayU.getResourceId(1, 0);
                    int i3 = rr.a;
                    try {
                        colorStateListA = rr.a(resources2, resources2.getXml(resourceId), theme);
                    } catch (Exception e) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    }
                }
            } else {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
        } else {
            colorStateListA = null;
        }
        if (colorStateListA != null) {
            aioVar2.c = colorStateListA;
        }
        boolean z3 = aioVar2.e;
        if (ul.y(xmlPullParser, "autoMirrored")) {
            z3 = typedArrayU.getBoolean(5, z3);
        }
        aioVar2.e = z3;
        ainVar.g = ul.q(typedArrayU, xmlPullParser, "viewportWidth", 7, ainVar.g);
        float fQ = ul.q(typedArrayU, xmlPullParser, "viewportHeight", 8, ainVar.h);
        ainVar.h = fQ;
        if (ainVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayU.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fQ > 0.0f) {
            int i4 = 3;
            ainVar.e = typedArrayU.getDimension(3, ainVar.e);
            float dimension = typedArrayU.getDimension(2, ainVar.f);
            ainVar.f = dimension;
            if (ainVar.e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(typedArrayU.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension > 0.0f) {
                ainVar.setAlpha(ul.q(typedArrayU, xmlPullParser, "alpha", 4, ainVar.getAlpha()));
                String string = typedArrayU.getString(0);
                if (string != null) {
                    ainVar.j = string;
                    ainVar.l.put(string, ainVar);
                }
                typedArrayU.recycle();
                aioVar.a = getChangingConfigurations();
                aioVar.k = true;
                aio aioVar3 = this.b;
                ain ainVar2 = aioVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(ainVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i4); i5 = 1) {
                    if (eventType == i2) {
                        String name = xmlPullParser.getName();
                        ail ailVar = (ail) arrayDeque.peek();
                        if (ailVar == null) {
                            i = depth;
                            z = z2;
                        } else if ("path".equals(name)) {
                            aik aikVar = new aik();
                            TypedArray typedArrayU2 = ul.u(resources, theme, attributeSet, aia.c);
                            aikVar.a = null;
                            if (ul.y(xmlPullParser, "pathData")) {
                                String string2 = typedArrayU2.getString(0);
                                if (string2 != null) {
                                    aikVar.n = string2;
                                }
                                String string3 = typedArrayU2.getString(2);
                                if (string3 != null) {
                                    aikVar.m = ul.n(string3);
                                }
                                aikVar.l = ul.C(typedArrayU2, xmlPullParser, theme, "fillColor", 1);
                                i = depth;
                                aikVar.d = ul.q(typedArrayU2, xmlPullParser, "fillAlpha", 12, aikVar.d);
                                int iS = ul.s(typedArrayU2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = aikVar.h;
                                if (iS == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (iS == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (iS == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                aikVar.h = cap;
                                int iS2 = ul.s(typedArrayU2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = aikVar.i;
                                if (iS2 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (iS2 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (iS2 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                aikVar.i = join;
                                aikVar.j = ul.q(typedArrayU2, xmlPullParser, "strokeMiterLimit", 10, aikVar.j);
                                aikVar.k = ul.C(typedArrayU2, xmlPullParser, theme, "strokeColor", 3);
                                aikVar.c = ul.q(typedArrayU2, xmlPullParser, "strokeAlpha", 11, aikVar.c);
                                aikVar.b = ul.q(typedArrayU2, xmlPullParser, "strokeWidth", 4, aikVar.b);
                                aikVar.f = ul.q(typedArrayU2, xmlPullParser, "trimPathEnd", 6, aikVar.f);
                                aikVar.g = ul.q(typedArrayU2, xmlPullParser, "trimPathOffset", 7, aikVar.g);
                                aikVar.e = ul.q(typedArrayU2, xmlPullParser, "trimPathStart", 5, aikVar.e);
                                aikVar.o = ul.s(typedArrayU2, xmlPullParser, "fillType", 13, aikVar.o);
                            } else {
                                i = depth;
                            }
                            typedArrayU2.recycle();
                            ailVar.b.add(aikVar);
                            if (aikVar.getPathName() != null) {
                                ainVar2.l.put(aikVar.getPathName(), aikVar);
                            }
                            int i6 = aioVar3.a;
                            i4 = 3;
                            z = false;
                            z4 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                aij aijVar = new aij();
                                if (ul.y(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayU3 = ul.u(resources, theme, attributeSet, aia.d);
                                    String string4 = typedArrayU3.getString(0);
                                    if (string4 != null) {
                                        aijVar.n = string4;
                                    }
                                    String string5 = typedArrayU3.getString(1);
                                    if (string5 != null) {
                                        aijVar.m = ul.n(string5);
                                    }
                                    aijVar.o = ul.s(typedArrayU3, xmlPullParser, "fillType", 2, 0);
                                    typedArrayU3.recycle();
                                }
                                ailVar.b.add(aijVar);
                                if (aijVar.getPathName() != null) {
                                    ainVar2.l.put(aijVar.getPathName(), aijVar);
                                }
                                int i7 = aioVar3.a;
                                i4 = 3;
                                z = false;
                            } else if ("group".equals(name)) {
                                ail ailVar2 = new ail();
                                TypedArray typedArrayU4 = ul.u(resources, theme, attributeSet, aia.b);
                                ailVar2.l = null;
                                ailVar2.c = ul.q(typedArrayU4, xmlPullParser, "rotation", 5, ailVar2.c);
                                ailVar2.d = typedArrayU4.getFloat(1, ailVar2.d);
                                ailVar2.e = typedArrayU4.getFloat(2, ailVar2.e);
                                ailVar2.f = ul.q(typedArrayU4, xmlPullParser, "scaleX", 3, ailVar2.f);
                                ailVar2.g = ul.q(typedArrayU4, xmlPullParser, "scaleY", 4, ailVar2.g);
                                ailVar2.h = ul.q(typedArrayU4, xmlPullParser, "translateX", 6, ailVar2.h);
                                ailVar2.i = ul.q(typedArrayU4, xmlPullParser, "translateY", 7, ailVar2.i);
                                z = false;
                                String string6 = typedArrayU4.getString(0);
                                if (string6 != null) {
                                    ailVar2.m = string6;
                                }
                                ailVar2.m();
                                typedArrayU4.recycle();
                                ailVar.b.add(ailVar2);
                                arrayDeque.push(ailVar2);
                                if (ailVar2.getGroupName() != null) {
                                    ainVar2.l.put(ailVar2.getGroupName(), ailVar2);
                                }
                                int i8 = aioVar3.a;
                                i4 = 3;
                            } else {
                                z = false;
                            }
                        }
                        i4 = 3;
                    } else {
                        i = depth;
                        z = z2;
                        if (eventType == i4 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    z2 = z;
                    depth = i;
                    i2 = 2;
                }
                if (!z4) {
                    this.d = b(aioVar.c, aioVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(String.valueOf(typedArrayU.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        throw new XmlPullParserException(String.valueOf(typedArrayU.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
    }

    public aiq(aio aioVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = aioVar;
        this.d = b(aioVar.c, aioVar.d);
    }
}
