package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.as.oss.R;
import defpackage.aaw;
import defpackage.aca;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context G;
    private final ArrayAdapter H;
    private Spinner I;
    private final AdapterView.OnItemSelectedListener J;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.J = new aaw(this, 0);
        this.G = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.H = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.H.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) {
        Spinner spinner = (Spinner) acaVar.a.findViewById(R.id.spinner);
        this.I = spinner;
        spinner.setAdapter((SpinnerAdapter) this.H);
        this.I.setOnItemSelectedListener(this.J);
        Spinner spinner2 = this.I;
        String str = ((ListPreference) this).i;
        CharSequence[] charSequenceArr = ((ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                }
                length--;
            }
        }
        spinner2.setSelection(i);
        super.a(acaVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.I.performClick();
    }

    @Override // androidx.preference.Preference
    protected final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.H;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
