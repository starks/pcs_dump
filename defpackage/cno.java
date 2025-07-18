package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.util.Xml;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cno {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final ColorStateList i;
    public final float j;
    public Typeface k;
    private final int l;
    private boolean m = false;
    private boolean n = false;

    public cno(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, cnm.b);
        this.j = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.i = cnx.i(context, typedArrayObtainStyledAttributes, 3);
        cnx.i(context, typedArrayObtainStyledAttributes, 4);
        cnx.i(context, typedArrayObtainStyledAttributes, 5);
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iH = cnx.h(typedArrayObtainStyledAttributes, 12, 10);
        this.l = typedArrayObtainStyledAttributes.getResourceId(iH, 0);
        this.b = typedArrayObtainStyledAttributes.getString(iH);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = cnx.i(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, cnm.a);
        typedArrayObtainStyledAttributes2.hasValue(0);
        this.h = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.getString(cnx.h(typedArrayObtainStyledAttributes2, 3, 1));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void d() {
        Typeface typeface;
        String str;
        if (this.k == null && (str = this.b) != null) {
            this.k = Typeface.create(str, this.c);
        }
        if (this.k == null) {
            int i = this.d;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i != 3) {
                    this.k = Typeface.DEFAULT;
                    this.k = Typeface.create(this.k, this.c);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.k = typeface;
            this.k = Typeface.create(this.k, this.c);
        }
    }

    public final Typeface a() {
        d();
        return this.k;
    }

    public final void c(Context context, ceg cegVar) {
        Context context2;
        Typeface typefaceA;
        String string;
        Typeface typefaceCreate;
        if (this.m) {
            context2 = context;
        } else {
            int i = this.l;
            if (i == 0) {
                context2 = context;
            } else {
                ThreadLocal threadLocal = rw.a;
                Typeface typefaceCreate2 = null;
                if (context.isRestricted()) {
                    context2 = context;
                    typefaceA = null;
                } else {
                    context2 = context;
                    typefaceA = rw.a(context2, i, new TypedValue(), 0, null, false, true);
                }
                if (typefaceA != null) {
                    this.k = typefaceA;
                } else {
                    if (!this.n) {
                        this.n = true;
                        int i2 = this.l;
                        Resources resources = context2.getResources();
                        if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                            string = null;
                            if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                                typefaceCreate2 = Typeface.create(typefaceCreate, this.c);
                            }
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(i2);
                                while (xml.getEventType() != 1) {
                                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), re.b);
                                        string = typedArrayObtainAttributes.getString(7);
                                        typedArrayObtainAttributes.recycle();
                                        break;
                                    }
                                    xml.next();
                                }
                            } catch (Throwable unused) {
                            }
                            string = null;
                            if (string != null) {
                                typefaceCreate2 = Typeface.create(typefaceCreate, this.c);
                            }
                        }
                    }
                    if (typefaceCreate2 != null) {
                        this.k = typefaceCreate2;
                    }
                }
                this.m = true;
            }
            d();
        }
        int i3 = this.l;
        if (i3 == 0) {
            this.m = true;
        }
        if (this.m) {
            cegVar.e(this.k);
            return;
        }
        try {
            cnn cnnVar = new cnn(this, cegVar);
            ThreadLocal threadLocal2 = rw.a;
            if (context2.isRestricted()) {
                cnnVar.c(-4);
            } else {
                rw.a(context2, i3, new TypedValue(), 0, cnnVar, false, false);
            }
        } catch (Resources.NotFoundException unused2) {
            this.m = true;
            cegVar.f();
        } catch (Exception unused3) {
            this.m = true;
            cegVar.f();
        }
    }
}
