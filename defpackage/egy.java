package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egy {
    public static final ehh a;
    private static final ehh b;

    static {
        egr egrVar = egr.a;
        b = null;
        a = new ehh(null);
    }

    public static void A(int i, List list, fsc fscVar, egx egxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            fscVar.H(i, list.get(i2), egxVar);
        }
    }

    public static void B(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            ((eei) fscVar.a).C(i3);
            while (i2 < list.size()) {
                ((eei) fscVar.a).p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        efc efcVar = (efc) list;
        if (!z) {
            while (i2 < efcVar.c) {
                ((eei) fscVar.a).o(i, efcVar.d(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < efcVar.c; i6++) {
            efcVar.d(i6);
            i5 += 4;
        }
        ((eei) fscVar.a).C(i5);
        while (i2 < efcVar.c) {
            ((eei) fscVar.a).p(efcVar.d(i2));
            i2++;
        }
    }

    public static void C(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efy)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).q(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            ((eei) fscVar.a).C(i3);
            while (i2 < list.size()) {
                ((eei) fscVar.a).r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        efy efyVar = (efy) list;
        if (!z) {
            while (i2 < efyVar.c) {
                ((eei) fscVar.a).q(i, efyVar.a(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < efyVar.c; i6++) {
            efyVar.a(i6);
            i5 += 8;
        }
        ((eei) fscVar.a).C(i5);
        while (i2 < efyVar.c) {
            ((eei) fscVar.a).r(efyVar.a(i2));
            i2++;
        }
    }

    public static void D(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).an(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int iT = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iT += eei.T(((Integer) list.get(i3)).intValue());
            }
            ((eei) fscVar.a).C(iT);
            while (i2 < list.size()) {
                ((eei) fscVar.a).ao(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        efc efcVar = (efc) list;
        if (!z) {
            while (i2 < efcVar.c) {
                ((eei) fscVar.a).an(i, efcVar.d(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int iT2 = 0;
        for (int i4 = 0; i4 < efcVar.c; i4++) {
            iT2 += eei.T(efcVar.d(i4));
        }
        ((eei) fscVar.a).C(iT2);
        while (i2 < efcVar.c) {
            ((eei) fscVar.a).ao(efcVar.d(i2));
            i2++;
        }
    }

    public static void E(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efy)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).ap(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += eei.V(((Long) list.get(i3)).longValue());
            }
            ((eei) fscVar.a).C(iV);
            while (i2 < list.size()) {
                ((eei) fscVar.a).aq(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        efy efyVar = (efy) list;
        if (!z) {
            while (i2 < efyVar.c) {
                ((eei) fscVar.a).ap(i, efyVar.a(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < efyVar.c; i4++) {
            iV2 += eei.V(efyVar.a(i4));
        }
        ((eei) fscVar.a).C(iV2);
        while (i2 < efyVar.c) {
            ((eei) fscVar.a).aq(efyVar.a(i2));
            i2++;
        }
    }

    public static void F(int i, List list, fsc fscVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efw)) {
            while (i2 < list.size()) {
                ((eei) fscVar.a).y(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        efw efwVar = (efw) list;
        while (i2 < list.size()) {
            Object objC = efwVar.c();
            if (objC instanceof String) {
                ((eei) fscVar.a).y(i, (String) objC);
            } else {
                ((eei) fscVar.a).m(i, (eea) objC);
            }
            i2++;
        }
    }

    public static void G(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int iAa = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAa += eei.aa(((Integer) list.get(i3)).intValue());
            }
            ((eei) fscVar.a).C(iAa);
            while (i2 < list.size()) {
                ((eei) fscVar.a).C(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        efc efcVar = (efc) list;
        if (!z) {
            while (i2 < efcVar.c) {
                ((eei) fscVar.a).B(i, efcVar.d(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int iAa2 = 0;
        for (int i4 = 0; i4 < efcVar.c; i4++) {
            iAa2 += eei.aa(efcVar.d(i4));
        }
        ((eei) fscVar.a).C(iAa2);
        while (i2 < efcVar.c) {
            ((eei) fscVar.a).C(efcVar.d(i2));
            i2++;
        }
    }

    public static void H(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efy)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int iAc = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAc += eei.ac(((Long) list.get(i3)).longValue());
            }
            ((eei) fscVar.a).C(iAc);
            while (i2 < list.size()) {
                ((eei) fscVar.a).E(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        efy efyVar = (efy) list;
        if (!z) {
            while (i2 < efyVar.c) {
                ((eei) fscVar.a).D(i, efyVar.a(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int iAc2 = 0;
        for (int i4 = 0; i4 < efyVar.c; i4++) {
            iAc2 += eei.ac(efyVar.a(i4));
        }
        ((eei) fscVar.a).C(iAc2);
        while (i2 < efyVar.c) {
            ((eei) fscVar.a).E(efyVar.a(i2));
            i2++;
        }
    }

    static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof efc)) {
            int iL = 0;
            while (i < size) {
                iL += eei.L(((Integer) list.get(i)).intValue());
                i++;
            }
            return iL;
        }
        efc efcVar = (efc) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += eei.L(efcVar.d(i));
            i++;
        }
        return iL2;
    }

    static int b(List list) {
        return list.size() * 4;
    }

    static int c(List list) {
        return list.size() * 8;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof efc)) {
            int iL = 0;
            while (i < size) {
                iL += eei.L(((Integer) list.get(i)).intValue());
                i++;
            }
            return iL;
        }
        efc efcVar = (efc) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += eei.L(efcVar.d(i));
            i++;
        }
        return iL2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof efy)) {
            int iAc = 0;
            while (i < size) {
                iAc += eei.ac(((Long) list.get(i)).longValue());
                i++;
            }
            return iAc;
        }
        efy efyVar = (efy) list;
        int iAc2 = 0;
        while (i < size) {
            iAc2 += eei.ac(efyVar.a(i));
            i++;
        }
        return iAc2;
    }

    static int f(int i, Object obj, egx egxVar) {
        return obj instanceof efv ? eei.N(i, (efv) obj) : eei.Y(i) + eei.R((egi) obj, egxVar);
    }

    static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof efc)) {
            int iT = 0;
            while (i < size) {
                iT += eei.T(((Integer) list.get(i)).intValue());
                i++;
            }
            return iT;
        }
        efc efcVar = (efc) list;
        int iT2 = 0;
        while (i < size) {
            iT2 += eei.T(efcVar.d(i));
            i++;
        }
        return iT2;
    }

    static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof efy)) {
            int iV = 0;
            while (i < size) {
                iV += eei.V(((Long) list.get(i)).longValue());
                i++;
            }
            return iV;
        }
        efy efyVar = (efy) list;
        int iV2 = 0;
        while (i < size) {
            iV2 += eei.V(efyVar.a(i));
            i++;
        }
        return iV2;
    }

    static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof efc)) {
            int iAa = 0;
            while (i < size) {
                iAa += eei.aa(((Integer) list.get(i)).intValue());
                i++;
            }
            return iAa;
        }
        efc efcVar = (efc) list;
        int iAa2 = 0;
        while (i < size) {
            iAa2 += eei.aa(efcVar.d(i));
            i++;
        }
        return iAa2;
    }

    static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof efy)) {
            int iAc = 0;
            while (i < size) {
                iAc += eei.ac(((Long) list.get(i)).longValue());
                i++;
            }
            return iAc;
        }
        efy efyVar = (efy) list;
        int iAc2 = 0;
        while (i < size) {
            iAc2 += eei.ac(efyVar.a(i));
            i++;
        }
        return iAc2;
    }

    static Object k(Object obj, int i, List list, efg efgVar, Object obj2, ehh ehhVar) {
        if (efgVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!efgVar.a(iIntValue)) {
                    obj2 = l(obj, i, iIntValue, obj2, ehhVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (efgVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = l(obj, i, iIntValue2, obj2, ehhVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object l(Object obj, int i, int i2, Object obj2, ehh ehhVar) {
        if (obj2 == null) {
            obj2 = ehhVar.c(obj);
        }
        ehhVar.g(obj2, i, i2);
        return obj2;
    }

    static void m(ehh ehhVar, Object obj, Object obj2) {
        ehhVar.j(obj, ehhVar.e(ehhVar.d(obj), ehhVar.d(obj2)));
    }

    static int n(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * eei.at(i);
    }

    static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * eei.au(i);
    }

    static void p(ebz ebzVar, Object obj, Object obj2) {
        eep eepVarH = ebz.h(obj2);
        if (eepVarH.h()) {
            return;
        }
        eep eepVarI = ebz.i(obj);
        int i = eepVarH.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            eepVarI.f(eepVarH.b.d(i2));
        }
        Iterator it = eepVarH.b.a().iterator();
        while (it.hasNext()) {
            eepVarI.f((Map.Entry) it.next());
        }
    }

    public static void q(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof edq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).l(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            ((eei) fscVar.a).C(i3);
            while (i2 < list.size()) {
                ((eei) fscVar.a).j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        edq edqVar = (edq) list;
        if (!z) {
            while (i2 < edqVar.b) {
                ((eei) fscVar.a).l(i, edqVar.g(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < edqVar.b; i6++) {
            edqVar.g(i6);
            i5++;
        }
        ((eei) fscVar.a).C(i5);
        while (i2 < edqVar.b) {
            ((eei) fscVar.a).j(edqVar.g(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void r(int i, List list, fsc fscVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((eei) fscVar.a).m(i, (eea) list.get(i2));
        }
    }

    public static void s(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eej)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).ai(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            ((eei) fscVar.a).C(i3);
            while (i2 < list.size()) {
                ((eei) fscVar.a).aj(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        eej eejVar = (eej) list;
        if (!z) {
            while (i2 < eejVar.c) {
                ((eei) fscVar.a).ai(i, eejVar.d(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eejVar.c; i6++) {
            eejVar.d(i6);
            i5 += 8;
        }
        ((eei) fscVar.a).C(i5);
        while (i2 < eejVar.c) {
            ((eei) fscVar.a).aj(eejVar.d(i2));
            i2++;
        }
    }

    public static void t(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += eei.L(((Integer) list.get(i3)).intValue());
            }
            ((eei) fscVar.a).C(iL);
            while (i2 < list.size()) {
                ((eei) fscVar.a).t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        efc efcVar = (efc) list;
        if (!z) {
            while (i2 < efcVar.c) {
                ((eei) fscVar.a).s(i, efcVar.d(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < efcVar.c; i4++) {
            iL2 += eei.L(efcVar.d(i4));
        }
        ((eei) fscVar.a).C(iL2);
        while (i2 < efcVar.c) {
            ((eei) fscVar.a).t(efcVar.d(i2));
            i2++;
        }
    }

    public static void u(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            ((eei) fscVar.a).C(i3);
            while (i2 < list.size()) {
                ((eei) fscVar.a).p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        efc efcVar = (efc) list;
        if (!z) {
            while (i2 < efcVar.c) {
                ((eei) fscVar.a).o(i, efcVar.d(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < efcVar.c; i6++) {
            efcVar.d(i6);
            i5 += 4;
        }
        ((eei) fscVar.a).C(i5);
        while (i2 < efcVar.c) {
            ((eei) fscVar.a).p(efcVar.d(i2));
            i2++;
        }
    }

    public static void v(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efy)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).q(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            ((eei) fscVar.a).C(i3);
            while (i2 < list.size()) {
                ((eei) fscVar.a).r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        efy efyVar = (efy) list;
        if (!z) {
            while (i2 < efyVar.c) {
                ((eei) fscVar.a).q(i, efyVar.a(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < efyVar.c; i6++) {
            efyVar.a(i6);
            i5 += 8;
        }
        ((eei) fscVar.a).C(i5);
        while (i2 < efyVar.c) {
            ((eei) fscVar.a).r(efyVar.a(i2));
            i2++;
        }
    }

    public static void w(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ees)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).ak(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            ((eei) fscVar.a).C(i3);
            while (i2 < list.size()) {
                ((eei) fscVar.a).al(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        ees eesVar = (ees) list;
        if (!z) {
            while (i2 < eesVar.c) {
                ((eei) fscVar.a).ak(i, eesVar.d(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eesVar.c; i6++) {
            eesVar.d(i6);
            i5 += 4;
        }
        ((eei) fscVar.a).C(i5);
        while (i2 < eesVar.c) {
            ((eei) fscVar.a).al(eesVar.d(i2));
            i2++;
        }
    }

    public static void x(int i, List list, fsc fscVar, egx egxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            fscVar.E(i, list.get(i2), egxVar);
        }
    }

    public static void y(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += eei.L(((Integer) list.get(i3)).intValue());
            }
            ((eei) fscVar.a).C(iL);
            while (i2 < list.size()) {
                ((eei) fscVar.a).t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        efc efcVar = (efc) list;
        if (!z) {
            while (i2 < efcVar.c) {
                ((eei) fscVar.a).s(i, efcVar.d(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < efcVar.c; i4++) {
            iL2 += eei.L(efcVar.d(i4));
        }
        ((eei) fscVar.a).C(iL2);
        while (i2 < efcVar.c) {
            ((eei) fscVar.a).t(efcVar.d(i2));
            i2++;
        }
    }

    public static void z(int i, List list, fsc fscVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof efy)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eei) fscVar.a).D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ((eei) fscVar.a).A(i, 2);
            int iAc = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAc += eei.ac(((Long) list.get(i3)).longValue());
            }
            ((eei) fscVar.a).C(iAc);
            while (i2 < list.size()) {
                ((eei) fscVar.a).E(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        efy efyVar = (efy) list;
        if (!z) {
            while (i2 < efyVar.c) {
                ((eei) fscVar.a).D(i, efyVar.a(i2));
                i2++;
            }
            return;
        }
        ((eei) fscVar.a).A(i, 2);
        int iAc2 = 0;
        for (int i4 = 0; i4 < efyVar.c; i4++) {
            iAc2 += eei.ac(efyVar.a(i4));
        }
        ((eei) fscVar.a).C(iAc2);
        while (i2 < efyVar.c) {
            ((eei) fscVar.a).E(efyVar.a(i2));
            i2++;
        }
    }
}
