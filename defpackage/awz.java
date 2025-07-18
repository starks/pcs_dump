package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.as.oss.R;
import j$.lang.Iterable$EL;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import j$.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awz extends awc {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogFragment");
    public avm ab;
    public auh ac;
    public avs ad;
    public dw ae;
    private final fsc af = new fsc((char[]) null, (byte[]) null);
    public cxc b;
    public avy c;
    public SwipeRefreshLayout d;

    @Override // defpackage.ab
    public final void N() {
        if (((AtomicInteger) this.af.a).get() == 0) {
            auh auhVar = this.ac;
            asr asrVar = (asr) atc.a.createBuilder();
            atk atkVar = atk.PCS_NETWORK_USAGE_LOG_NO_ITEM_INSPECTED;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            atc atcVar = (atc) asrVar.a;
            atcVar.c = atkVar.H;
            atcVar.b |= 1;
            auhVar.a((atc) asrVar.z());
            ((czl) ((czl) a.c()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogFragment", "onDestroy", 82, "NetworkUsageLogFragment.java")).p("No log item inspected.");
        }
        super.N();
    }

    @Override // defpackage.ab
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.ae = new dw(this.ad);
        this.c = (avy) new aac(this, new avx(this.ab)).a(avy.class);
        View viewInflate = layoutInflater.inflate(R.layout.network_usage_log_fragment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.log_swipe_refresh_container);
        this.d = swipeRefreshLayout;
        swipeRefreshLayout.j = this;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.log_recycler_view);
        recyclerView.S(this.ae);
        recyclerView.T(new LinearLayoutManager(r()));
        this.c.a.d(this, new zj() { // from class: awy
            @Override // defpackage.zj
            public final void a(Object obj) {
                awz awzVar = this.a;
                List list = (List) obj;
                if (!awzVar.ae.a.e.isEmpty() || list == null) {
                    return;
                }
                ((czl) ((czl) awz.a.b()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogFragment", "initRecyclerViewIfRequired", 91, "NetworkUsageLogFragment.java")).p("Initializing entity list");
                awzVar.al(list);
                awzVar.d.i(false);
            }
        });
        return viewInflate;
    }

    public final void al(List list) {
        int i;
        if (list == null) {
            return;
        }
        this.d.i(true);
        cxc cxcVarO = cxc.o(list);
        cxc cxcVar = this.b;
        fsc fscVar = this.af;
        czn cznVar = awt.a;
        cxc cxcVarA = (cxc) Collection.EL.stream(cxcVarO).map(new alg(10)).collect(cvu.a);
        int size = cxcVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            cxcVarA = ((avw) cxcVar.get(i3)).a(cxcVarA);
        }
        cwy cwyVar = new cwy();
        int size2 = cxcVarA.size();
        int size3 = 0;
        long jE = 0;
        long jC = 0;
        int i4 = 0;
        while (i4 < size2) {
            aww awwVar = (aww) cxcVarA.get(i4);
            size3 += awwVar.b.size();
            cxc cxcVar2 = awwVar.b;
            int size4 = cxcVar2.size();
            int i5 = 0;
            while (true) {
                i = i4 + 1;
                if (i5 < size4) {
                    ava avaVar = (ava) cxcVar2.get(i5);
                    jE += avaVar.e();
                    jC += avaVar.c();
                    i5++;
                }
            }
            i4 = i;
        }
        axe axeVar = new axe(null);
        axeVar.a = size3;
        byte b = axeVar.d;
        axeVar.b = jE;
        axeVar.c = jC;
        axeVar.d = (byte) (b | 7);
        cwyVar.h(new axh(new axf(size3, jE, jC)));
        cwy cwyVar2 = new cwy();
        cxd cxdVarO = dcr.o(cxc.t(aww.a, cxcVarA), new avf(4));
        czc czcVarListIterator = cxdVarO.map.keySet().listIterator();
        while (czcVarListIterator.hasNext()) {
            LocalDate localDate = (LocalDate) czcVarListIterator.next();
            cwyVar2.h(new avu(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))));
            cwyVar2.j(cxdVarO.b(localDate));
        }
        cwyVar.j(cwyVar2.g());
        cxc cxcVarG = cwyVar.g();
        Iterable$EL.forEach(cxcVarG, new awp(fscVar, i2));
        this.ae.a.b(cxcVarG, new ls(this, 19));
    }
}
