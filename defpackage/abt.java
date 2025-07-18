package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abt {
    private static final Class[] b = {Context.class, AttributeSet.class};
    private static final HashMap c = new HashMap();
    public final Context a;
    private abx e;
    private final Object[] d = new Object[2];
    private String[] f = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};

    public abt(Context context, abx abxVar) {
        this.a = context;
        this.e = abxVar;
    }

    private final Preference b(String str, String[] strArr, AttributeSet attributeSet) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) c.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr != null) {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (int i = 0; i < 2; i++) {
                            try {
                                cls = Class.forName(strArr[i] + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(a.A(str, attributeSet, ": Error inflating class "));
                            }
                            throw e;
                        }
                    } else {
                        cls = Class.forName(str, false, classLoader);
                    }
                    constructor = cls.getConstructor(b);
                    constructor.setAccessible(true);
                    c.put(str, constructor);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException(a.A(str, attributeSet, ": Error inflating class "));
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        }
        Object[] objArr = this.d;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private final Preference c(String str, AttributeSet attributeSet) {
        try {
            return str.indexOf(46) == -1 ? b(str, this.f, attributeSet) : b(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(a.A(str, attributeSet, ": Error inflating class (not found)"));
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(a.A(str, attributeSet, ": Error inflating class "));
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    private final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jA;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                } else {
                    next = 3;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.t = Intent.parseIntent(this.a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    this.a.getResources().parseBundleExtra("extra", attributeSet, preference.p());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceC = c(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.b.contains(preferenceC)) {
                        if (preferenceC.s != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.C;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = preferenceC.s;
                            if (preferenceGroup2.l(str) != null) {
                                Log.e("PreferenceGroup", a.z(str, "Found duplicated key: \"", "\". This can cause unintended behaviour, please use unique keys for every preference."));
                            }
                        }
                        if (preferenceC.n == Integer.MAX_VALUE) {
                            if (preferenceGroup.c) {
                                int i = preferenceGroup.d;
                                preferenceGroup.d = i + 1;
                                preferenceC.D(i);
                            }
                            if (preferenceC instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceC).c = preferenceGroup.c;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.b, preferenceC);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (-iBinarySearch) - 1;
                        }
                        preferenceC.N(preferenceGroup.j());
                        synchronized (preferenceGroup) {
                            preferenceGroup.b.add(iBinarySearch, preferenceC);
                        }
                        abx abxVar = preferenceGroup.k;
                        String str2 = preferenceC.s;
                        if (str2 == null || !preferenceGroup.a.containsKey(str2)) {
                            jA = abxVar.a();
                        } else {
                            jA = ((Long) preferenceGroup.a.get(str2)).longValue();
                            preferenceGroup.a.remove(str2);
                        }
                        preferenceC.l = jA;
                        preferenceC.m = true;
                        try {
                            preferenceC.y(abxVar);
                            preferenceC.m = false;
                            if (preferenceC.C != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceC.C = preferenceGroup;
                            if (preferenceGroup.e) {
                                preferenceC.x();
                            }
                            preferenceGroup.w();
                        } catch (Throwable th) {
                            preferenceC.m = false;
                            throw th;
                        }
                    }
                    d(xmlPullParser, preferenceC, attributeSet);
                }
            }
        }
    }

    public final Preference a(XmlPullParser xmlPullParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.d) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.d[0] = this.a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        preferenceGroup = (PreferenceGroup) c(xmlPullParser.getName(), attributeSetAsAttributeSet);
                        preferenceGroup.y(this.e);
                        d(xmlPullParser, preferenceGroup, attributeSetAsAttributeSet);
                    }
                } catch (InflateException e) {
                    throw e;
                } catch (IOException e2) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e2.getMessage());
                    inflateException.initCause(e2);
                    throw inflateException;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
        }
        return preferenceGroup;
    }
}
