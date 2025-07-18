package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.miphone.astrea.networkusage.ui.user.NetworkUsageItemDetailsActivity;
import j$.time.Instant;
import j$.util.Comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aww extends awk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new apz(6);
    public static final Comparator a = Comparator.CC.comparing(new alg(12), Comparator.CC.reverseOrder());
    public final cxc b;
    public fsc c = null;

    public aww(Parcel parcel) {
        this.b = cxc.o(parcel.readParcelableList(new ArrayList(), ava.class.getClassLoader()));
    }

    public final aux a() {
        return ((ava) this.b.get(0)).g();
    }

    @Override // defpackage.awk
    public final awj b() {
        return awj.a;
    }

    @Override // defpackage.awk
    public final boolean c(awk awkVar) {
        if (!(awkVar instanceof aww)) {
            return false;
        }
        aww awwVar = (aww) awkVar;
        if (f().equals(awwVar.f())) {
            if (this.b.size() == awwVar.b.size() && this.b.containsAll(awwVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.awk
    public final boolean d(awk awkVar) {
        if (awkVar instanceof aww) {
            return a().equals(((aww) awkVar).a());
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.awk
    public final void e(Context context) {
        fsc fscVar = this.c;
        if (fscVar != null) {
            ((AtomicInteger) fscVar.a).incrementAndGet();
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) NetworkUsageItemDetailsActivity.class));
        intent.putExtra("NETWORK_USAGE_ITEM_EXTRA_KEY", this);
        context.startActivity(intent);
    }

    public final Instant f() {
        return ((ava) this.b.get(0)).i();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableList(this.b, i);
    }

    public aww(cxc cxcVar) {
        this.b = cxc.t(ava.a, cxcVar);
    }
}
