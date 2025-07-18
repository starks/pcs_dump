package defpackage;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aay extends abj {
    public EditText ab;
    public final Runnable ac = new ls(this, 9, null);
    public long ad = -1;
    private CharSequence ae;

    private final EditTextPreference aq() {
        return (EditTextPreference) ap();
    }

    @Override // defpackage.abj
    protected final void al(View view) {
        super.al(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.ab = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ab.setText(this.ae);
        EditText editText2 = this.ab;
        editText2.setSelection(editText2.getText().length());
        aq();
    }

    @Override // defpackage.abj
    public final void am(boolean z) {
        if (z) {
            aq().i(this.ab.getText().toString());
        }
    }

    public final void an(boolean z) {
        this.ad = -1L;
    }

    @Override // defpackage.abj
    protected final boolean ao() {
        return true;
    }

    @Override // defpackage.abj, defpackage.x, defpackage.ab
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle == null) {
            this.ae = aq().g;
        } else {
            this.ae = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.abj, defpackage.x, defpackage.ab
    public final void g(Bundle bundle) {
        super.g(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ae);
    }
}
