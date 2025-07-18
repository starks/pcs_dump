package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class al implements LayoutInflater.Factory2 {
    final ax a;

    public al(ax axVar) {
        this.a = axVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        bc bcVarI;
        if (ah.class.getName().equals(str)) {
            return new ah(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = ai.a;
                try {
                    if (ab.class.isAssignableFrom(ai.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.A(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        ab abVarD = resourceId != -1 ? this.a.d(resourceId) : null;
                        if (abVarD == null && string != null) {
                            abVarD = this.a.e(string);
                        }
                        if (abVarD == null && id != -1) {
                            abVarD = this.a.d(id);
                        }
                        if (abVarD == null) {
                            ai aiVarG = this.a.g();
                            context.getClassLoader();
                            abVarD = aiVarG.b(attributeValue);
                            abVarD.t = true;
                            abVarD.D = resourceId != 0 ? resourceId : id;
                            abVarD.E = id;
                            abVarD.F = string;
                            abVarD.u = true;
                            abVarD.z = this.a;
                            ax axVar = this.a;
                            abVarD.A = axVar.l;
                            Context context2 = axVar.l.c;
                            Bundle bundle = abVarD.g;
                            abVarD.ah();
                            bcVarI = this.a.h(abVarD);
                            if (ax.X(2)) {
                                Objects.toString(abVarD);
                                Integer.toHexString(resourceId);
                            }
                        } else {
                            if (abVarD.u) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            abVarD.u = true;
                            abVarD.z = this.a;
                            ax axVar2 = this.a;
                            abVarD.A = axVar2.l;
                            Context context3 = axVar2.l.c;
                            abVarD.ah();
                            bcVarI = this.a.i(abVarD);
                            if (ax.X(2)) {
                                Objects.toString(abVarD);
                                Integer.toHexString(resourceId);
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        yb ybVar = yb.a;
                        abVarD.getClass();
                        yc ycVar = new yc(abVarD, viewGroup);
                        yb.d(ycVar);
                        ya yaVarB = yb.b(abVarD);
                        if (yaVarB.b.contains(xz.DETECT_FRAGMENT_TAG_USAGE) && yb.e(yaVarB, abVarD.getClass(), ycVar.getClass())) {
                            yb.c(yaVarB, ycVar);
                        }
                        abVarD.N = viewGroup;
                        bcVarI.d();
                        bcVarI.c();
                        View view2 = abVarD.O;
                        if (view2 == null) {
                            throw new IllegalStateException(a.z(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (abVarD.O.getTag() == null) {
                            abVarD.O.setTag(string);
                        }
                        abVarD.O.addOnAttachStateChangeListener(new ak(this, bcVarI));
                        return abVarD.O;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
