package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjn implements fkk, fjm {
    public static final Map a;
    public static final HashMap b;
    public static final fjp c = new fjp();
    private static final HashMap d;
    private static final HashMap e;
    private final Class f;

    static {
        List listB = ffh.B(fin.class, fiy.class, fjc.class, fjd.class, fje.class, fjf.class, fjg.class, fjh.class, fji.class, fjj.class, fio.class, fip.class, fiq.class, fir.class, fis.class, fit.class, fiu.class, fiv.class, fiw.class, fix.class, fiz.class, fja.class, fjb.class);
        ArrayList arrayList = new ArrayList(ffh.Q(listB));
        int i = 0;
        for (Object obj : listB) {
            int i2 = i + 1;
            if (i < 0) {
                ffh.D();
            }
            arrayList.add(new ffs((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = ffh.v(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        collectionValues.getClass();
        for (String str : collectionValues) {
            str.getClass();
            ffs ffsVar = new ffs("kotlin.jvm.internal." + fjz.F(str) + "CompanionObject", str.concat(".Companion"));
            map3.put(ffsVar.a, ffsVar.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        b = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffh.r(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), fjz.F((String) entry2.getValue()));
        }
    }

    public fjn(Class cls) {
        this.f = cls;
    }

    @Override // defpackage.fjm
    public final Class a() {
        return this.f;
    }

    @Override // defpackage.fkk
    public final String b() {
        String str;
        Class cls = this.f;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str2 = (String) b.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) b.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.fkk
    public final boolean c(Object obj) {
        Map map = a;
        map.getClass();
        Class clsM = this.f;
        Integer num = (Integer) map.get(clsM);
        if (num != null) {
            return fjz.b(obj, num.intValue());
        }
        if (clsM.isPrimitive()) {
            clsM = fjp.m(fjp.n(clsM));
        }
        return clsM.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fjn) && fjs.c(fjp.m(this), fjp.m((fkk) obj));
    }

    public final int hashCode() {
        return fjp.m(this).hashCode();
    }

    public final String toString() {
        Class cls = this.f;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }
}
