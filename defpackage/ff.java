package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ff implements sh {
    private static final int[] k = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public fd b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public fh i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private boolean n;
    private final ArrayList o;
    private boolean p;
    private final ArrayList q;
    private boolean r;
    private int s = 0;
    public boolean h = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final ArrayList w = new ArrayList();
    private final CopyOnWriteArrayList x = new CopyOnWriteArrayList();
    private boolean y = false;

    public ff(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.l = resources;
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.p = true;
        this.d = new ArrayList();
        this.q = new ArrayList();
        this.r = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = true;
        }
        this.n = z;
    }

    private final void E(int i, boolean z) {
        if (i < 0 || i >= this.c.size()) {
            return;
        }
        this.c.remove(i);
        if (z) {
            l(true);
        }
    }

    public final boolean A(MenuItem menuItem, fr frVar, int i) {
        boolean zH;
        fh fhVar = (fh) menuItem;
        if (fhVar != null && fhVar.isEnabled()) {
            boolean zN = fhVar.n();
            un unVar = fhVar.p;
            boolean z = unVar != null && unVar.c();
            if (fhVar.m()) {
                boolean zExpandActionView = fhVar.expandActionView() | zN;
                if (!zExpandActionView) {
                    return zExpandActionView;
                }
                i(true);
                return true;
            }
            if (!fhVar.hasSubMenu() && !z) {
                if ((i & 1) != 0) {
                    return zN;
                }
                i(true);
                return zN;
            }
            if ((i & 4) == 0) {
                i(false);
            }
            if (!fhVar.hasSubMenu()) {
                fhVar.l(new fy(this.a, this, fhVar));
            }
            fy fyVar = fhVar.k;
            if (z) {
                unVar.b(fyVar);
            }
            if (this.x.isEmpty()) {
                zH = false;
            } else {
                zH = frVar != null ? frVar.h(fyVar) : false;
                Iterator it = this.x.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    fr frVar2 = (fr) weakReference.get();
                    if (frVar2 == null) {
                        this.x.remove(weakReference);
                    } else if (!zH) {
                        zH = frVar2.h(fyVar);
                    }
                }
            }
            boolean z2 = zN | zH;
            if (z2) {
                return z2;
            }
            i(true);
        }
        return false;
    }

    final void B() {
        this.r = true;
        l(true);
    }

    final void C() {
        this.p = true;
        l(true);
    }

    public final void D() {
        this.s = 1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.l.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem menuItemC = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemC.setIcon(resolveInfo.loadIcon(packageManager));
            ((fh) menuItemC).e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemC;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.l.getString(i));
    }

    final fh b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.w;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (fh) arrayList.get(0);
        }
        boolean zX = x();
        for (int i2 = 0; i2 < size; i2++) {
            fh fhVar = (fh) arrayList.get(i2);
            char c = zX ? fhVar.h : fhVar.f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (zX && c == '\b' && i == 67))) {
                return fhVar;
            }
        }
        return null;
    }

    protected final MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (k[i5] << 16) | ((char) i3);
        fh fhVar = new fh(this, i, i2, i3, i6, charSequence, this.s);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((fh) arrayList.get(size)).c <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, fhVar);
        l(true);
        return fhVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        fh fhVar = this.i;
        if (fhVar != null) {
            t(fhVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        k();
        return this.q;
    }

    public final ArrayList f() {
        if (!this.p) {
            return this.o;
        }
        this.o.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            fh fhVar = (fh) this.c.get(i);
            if (fhVar.isVisible()) {
                this.o.add(fhVar);
            }
        }
        this.p = false;
        this.r = true;
        return this.o;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            fh fhVar = (fh) this.c.get(i2);
            if (fhVar.a == i) {
                return fhVar;
            }
            if (fhVar.hasSubMenu() && (menuItemFindItem = fhVar.k.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final void g(fr frVar) {
        h(frVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(fr frVar, Context context) {
        this.x.add(new WeakReference(frVar));
        frVar.c(context, this);
        this.r = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((fh) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            fr frVar = (fr) weakReference.get();
            if (frVar == null) {
                this.x.remove(weakReference);
            } else {
                frVar.d(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    final void j(List list, int i, KeyEvent keyEvent) {
        boolean zX = x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData)) {
            if (i != 67) {
                return;
            } else {
                i = 67;
            }
        }
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            fh fhVar = (fh) this.c.get(i2);
            if (fhVar.hasSubMenu()) {
                fhVar.k.j(list, i, keyEvent);
            }
            char c = zX ? fhVar.h : fhVar.f;
            if ((modifiers & 69647) == ((zX ? fhVar.i : fhVar.g) & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (zX && c == '\b' && i == 67)) && fhVar.isEnabled())) {
                list.add(fhVar);
            }
        }
    }

    public final void k() {
        ArrayList arrayListF = f();
        if (this.r) {
            Iterator it = this.x.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                fr frVar = (fr) weakReference.get();
                if (frVar == null) {
                    this.x.remove(weakReference);
                } else {
                    zG |= frVar.g();
                }
            }
            if (zG) {
                this.d.clear();
                this.q.clear();
                int size = arrayListF.size();
                for (int i = 0; i < size; i++) {
                    fh fhVar = (fh) arrayListF.get(i);
                    if (fhVar.o()) {
                        this.d.add(fhVar);
                    } else {
                        this.q.add(fhVar);
                    }
                }
            } else {
                this.d.clear();
                this.q.clear();
                this.q.addAll(f());
            }
            this.r = false;
        }
    }

    public final void l(boolean z) {
        if (this.h) {
            this.t = true;
            if (z) {
                this.u = true;
                return;
            }
            return;
        }
        if (z) {
            this.p = true;
            this.r = true;
        }
        if (this.x.isEmpty()) {
            return;
        }
        s();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            fr frVar = (fr) weakReference.get();
            if (frVar == null) {
                this.x.remove(weakReference);
            } else {
                frVar.l();
            }
        }
        r();
    }

    public final void m(fr frVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            fr frVar2 = (fr) weakReference.get();
            if (frVar2 == null || frVar2 == frVar) {
                this.x.remove(weakReference);
            }
        }
    }

    public final void n(Bundle bundle) {
        MenuItem menuItemFindItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((fy) item.getSubMenu()).n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void o(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((fy) item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(fd fdVar) {
        this.b = fdVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        fh fhVarB = b(i, keyEvent);
        boolean z = fhVarB != null ? z(fhVarB, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.l.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        l(false);
    }

    public final void r() {
        this.h = false;
        if (this.t) {
            this.t = false;
            l(this.u);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((fh) this.c.get(i2)).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((fh) this.c.get(i2)).b != i) {
                    break;
                }
                E(i2, false);
                i3 = i4;
            }
            l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((fh) this.c.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        E(i2, true);
    }

    public final void s() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.t = false;
        this.u = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            fh fhVar = (fh) this.c.get(i2);
            if (fhVar.b == i) {
                fhVar.j(z2);
                fhVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            fh fhVar = (fh) this.c.get(i2);
            if (fhVar.b == i) {
                fhVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            fh fhVar = (fh) this.c.get(i2);
            if (fhVar.b == i && fhVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.m = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(fh fhVar) {
        boolean zI = false;
        if (!this.x.isEmpty() && this.i == fhVar) {
            s();
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                fr frVar = (fr) weakReference.get();
                if (frVar == null) {
                    this.x.remove(weakReference);
                } else {
                    zI = frVar.i(fhVar);
                    if (zI) {
                        break;
                    }
                }
            }
            r();
            if (zI) {
                this.i = null;
            }
        }
        return zI;
    }

    public boolean u(ff ffVar, MenuItem menuItem) {
        fd fdVar = this.b;
        return fdVar != null && fdVar.J(ffVar, menuItem);
    }

    public boolean v(fh fhVar) {
        boolean zJ = false;
        if (this.x.isEmpty()) {
            return false;
        }
        s();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            fr frVar = (fr) weakReference.get();
            if (frVar == null) {
                this.x.remove(weakReference);
            } else {
                zJ = frVar.j(fhVar);
                if (zJ) {
                    break;
                }
            }
        }
        r();
        if (zJ) {
            this.i = fhVar;
        }
        return zJ;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.m;
    }

    public boolean y() {
        return this.n;
    }

    public final boolean z(MenuItem menuItem, int i) {
        return A(menuItem, null, i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        fh fhVar = (fh) c(i, i2, i3, charSequence);
        fy fyVar = new fy(this.a, this, fhVar);
        fhVar.l(fyVar);
        return fyVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public ff a() {
        return this;
    }
}
