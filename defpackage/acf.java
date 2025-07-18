package defpackage;

import android.widget.CompoundButton;
import androidx.preference.TwoStatePreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acf implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ TwoStatePreference a;
    private final /* synthetic */ int b;

    public acf(TwoStatePreference twoStatePreference, int i) {
        this.b = i;
        this.a = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        if (i == 0) {
            this.a.k(z);
            return;
        }
        TwoStatePreference twoStatePreference = this.a;
        if (i != 1) {
            twoStatePreference.k(z);
        } else {
            twoStatePreference.k(z);
        }
    }
}
