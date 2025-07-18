package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ur {
    public ur() {
    }

    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static zx c(zz zzVar, fkk fkkVar, aag aagVar) {
        return zzVar.b(fjp.l(fkkVar), aagVar);
    }

    public static zx d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static zx e(zz zzVar, Class cls) {
        return zzVar.a(cls);
    }

    public static ObjectAnimator f(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }

    public static afe g(afd afdVar) {
        return new afo(afdVar.a, afdVar.b, afdVar.c);
    }

    public static afj h(ekb ekbVar, SQLiteDatabase sQLiteDatabase) {
        ekbVar.getClass();
        Object obj = ekbVar.a;
        if (obj != null) {
            afj afjVar = (afj) obj;
            if (fjs.c(afjVar.c, sQLiteDatabase)) {
                return afjVar;
            }
        }
        afj afjVar2 = new afj(sQLiteDatabase);
        ekbVar.a = afjVar2;
        return afjVar2;
    }

    public ur(byte[] bArr) {
    }
}
