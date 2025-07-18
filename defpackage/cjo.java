package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjo {
    private final oc a = new oc();
    private final oc b = new oc();

    public static cjo a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            try {
                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
                if (animatorLoadAnimator instanceof AnimatorSet) {
                    return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
                }
                if (animatorLoadAnimator == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(animatorLoadAnimator);
                return c(arrayList);
            } catch (Exception e) {
                Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(resourceId))), e);
            }
        }
        return null;
    }

    private static cjo c(List list) {
        cjo cjoVar = new cjo();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            cjoVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            cjp cjpVar = new cjp(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            cjpVar.a = objectAnimator.getRepeatCount();
            cjpVar.b = objectAnimator.getRepeatMode();
            cjoVar.a.put(propertyName, cjpVar);
        }
        return cjoVar;
    }

    public final cjp b(String str) {
        if (this.a.get(str) != null) {
            return (cjp) this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cjo) {
            return this.a.equals(((cjo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
