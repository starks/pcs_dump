package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.google.android.as.oss.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kp {
    private static kp b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private agx h;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final ob g = new ob();

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        ob obVar = g;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) obVar.a(Integer.valueOf(ob.c(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        return porterDuffColorFilter2;
    }

    public static synchronized kp e() {
        if (b == null) {
            b = new kp();
        }
        return b;
    }

    static void g(Drawable drawable, lc lcVar, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            PorterDuffColorFilter porterDuffColorFilterB = null;
            if (lcVar.d) {
                colorStateList = lcVar.a;
            } else {
                if (!lcVar.c) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            PorterDuff.Mode mode = lcVar.c ? lcVar.b : a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterB);
        }
    }

    private static long j(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private final synchronized Drawable k(Context context, long j) {
        WeakReference weakReference;
        nz nzVar = (nz) this.d.get(context);
        if (nzVar != null && (weakReference = (WeakReference) nzVar.c(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = of.b(nzVar.b, nzVar.d, j);
            if (iB >= 0) {
                Object[] objArr = nzVar.c;
                Object obj = objArr[iB];
                Object obj2 = oa.a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    nzVar.a = true;
                }
            }
        }
        return null;
    }

    private final Drawable l(Context context, int i) {
        return null;
    }

    private final Drawable m(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListA = a(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListA != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListA);
            if (this.h != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        if (this.h != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                agx.d(layerDrawable.findDrawableByLayerId(android.R.id.background), kz.b(context, R.attr.colorControlNormal), gy.a);
                agx.d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), kz.b(context, R.attr.colorControlNormal), gy.a);
                agx.d(layerDrawable.findDrawableByLayerId(android.R.id.progress), kz.b(context, R.attr.colorControlActivated), gy.a);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                agx.d(layerDrawable2.findDrawableByLayerId(android.R.id.background), kz.a(context, R.attr.colorControlNormal), gy.a);
                agx.d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), kz.b(context, R.attr.colorControlActivated), gy.a);
                agx.d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), kz.b(context, R.attr.colorControlActivated), gy.a);
                return drawable;
            }
        }
        if (h(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    private final synchronized void n(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            nz nzVar = (nz) this.d.get(context);
            if (nzVar == null) {
                nzVar = new nz();
                this.d.put(context, nzVar);
            }
            nzVar.f(j, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        od odVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateListB = null;
        ColorStateList colorStateList = (weakHashMap == null || (odVar = (od) weakHashMap.get(context)) == null) ? null : (ColorStateList) oe.a(odVar, i);
        if (colorStateList == null) {
            agx agxVar = this.h;
            if (agxVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateListB = rm.b(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateListB = rm.b(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList colorStateListC = kz.c(context, R.attr.colorSwitchThumbNormal);
                    if (colorStateListC == null || !colorStateListC.isStateful()) {
                        iArr[0] = kz.a;
                        iArr2[0] = kz.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = kz.d;
                        iArr2[1] = kz.b(context, R.attr.colorControlActivated);
                        iArr[2] = kz.e;
                        iArr2[2] = kz.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = kz.a;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                        iArr[1] = kz.d;
                        iArr2[1] = kz.b(context, R.attr.colorControlActivated);
                        iArr[2] = kz.e;
                        iArr2[2] = colorStateListC.getDefaultColor();
                    }
                    colorStateListB = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateListB = agx.b(context, kz.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateListB = agx.b(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateListB = agx.b(context, kz.b(context, R.attr.colorAccent));
                } else if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    colorStateListB = rm.b(context, R.color.abc_tint_spinner);
                } else if (agx.a((int[]) agxVar.c, i)) {
                    colorStateListB = kz.c(context, R.attr.colorControlNormal);
                } else if (agx.a((int[]) agxVar.b, i)) {
                    colorStateListB = rm.b(context, R.color.abc_tint_default);
                } else if (agx.a((int[]) agxVar.e, i)) {
                    colorStateListB = rm.b(context, R.color.abc_tint_btn_checkable);
                } else if (i == R.drawable.abc_seekbar_thumb_material) {
                    colorStateListB = rm.b(context, R.color.abc_tint_seek_thumb);
                }
            }
            if (colorStateListB != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                od odVar2 = (od) this.c.get(context);
                if (odVar2 == null) {
                    odVar2 = new od();
                    this.c.put(context, odVar2);
                }
                odVar2.d(i, colorStateListB);
                return colorStateListB;
            }
            colorStateList = colorStateListB;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context r7, int r8, boolean r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f     // Catch: java.lang.Throwable -> Lbd
            r1 = 1
            if (r0 == 0) goto L7
            goto L26
        L7:
            r6.f = r1     // Catch: java.lang.Throwable -> Lbd
            r0 = 2131230838(0x7f080076, float:1.807774E38)
            android.graphics.drawable.Drawable r0 = r6.c(r7, r0)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb2
            boolean r2 = r0 instanceof defpackage.aiq     // Catch: java.lang.Throwable -> Lbd
            if (r2 != 0) goto L26
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r2 = "android.graphics.drawable.VectorDrawable"
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb2
        L26:
            android.graphics.drawable.Drawable r0 = r6.l(r7, r8)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto L9f
            android.util.TypedValue r0 = r6.e     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto L37
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch: java.lang.Throwable -> Lbd
            r0.<init>()     // Catch: java.lang.Throwable -> Lbd
            r6.e = r0     // Catch: java.lang.Throwable -> Lbd
        L37:
            android.util.TypedValue r0 = r6.e     // Catch: java.lang.Throwable -> Lbd
            android.content.res.Resources r2 = r7.getResources()     // Catch: java.lang.Throwable -> Lbd
            r2.getValue(r8, r0, r1)     // Catch: java.lang.Throwable -> Lbd
            long r1 = j(r0)     // Catch: java.lang.Throwable -> Lbd
            android.graphics.drawable.Drawable r3 = r6.k(r7, r1)     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto L9e
            agx r3 = r6.h     // Catch: java.lang.Throwable -> Lbd
            r4 = 0
            if (r3 != 0) goto L51
        L4f:
            r3 = r4
            goto L94
        L51:
            r3 = 2131230776(0x7f080038, float:1.8077614E38)
            if (r8 != r3) goto L6e
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable     // Catch: java.lang.Throwable -> Lbd
            r4 = 2131230775(0x7f080037, float:1.8077612E38)
            android.graphics.drawable.Drawable r4 = r6.c(r7, r4)     // Catch: java.lang.Throwable -> Lbd
            r5 = 2131230777(0x7f080039, float:1.8077616E38)
            android.graphics.drawable.Drawable r5 = r6.c(r7, r5)     // Catch: java.lang.Throwable -> Lbd
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[]{r4, r5}     // Catch: java.lang.Throwable -> Lbd
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbd
            goto L94
        L6e:
            r3 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r8 != r3) goto L7b
            r3 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r3 = defpackage.agx.c(r6, r7, r3)     // Catch: java.lang.Throwable -> Lbd
            goto L94
        L7b:
            r3 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r8 != r3) goto L88
            r3 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r3 = defpackage.agx.c(r6, r7, r3)     // Catch: java.lang.Throwable -> Lbd
            goto L94
        L88:
            r3 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r8 != r3) goto L4f
            r3 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r3 = defpackage.agx.c(r6, r7, r3)     // Catch: java.lang.Throwable -> Lbd
        L94:
            if (r3 == 0) goto L9e
            int r0 = r0.changingConfigurations     // Catch: java.lang.Throwable -> Lbd
            r3.setChangingConfigurations(r0)     // Catch: java.lang.Throwable -> Lbd
            r6.n(r7, r1, r3)     // Catch: java.lang.Throwable -> Lbd
        L9e:
            r0 = r3
        L9f:
            if (r0 != 0) goto La5
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r8)     // Catch: java.lang.Throwable -> Lbd
        La5:
            if (r0 == 0) goto Lab
            android.graphics.drawable.Drawable r0 = r6.m(r7, r8, r9, r0)     // Catch: java.lang.Throwable -> Lbd
        Lab:
            if (r0 == 0) goto Lb0
            defpackage.il.b(r0)     // Catch: java.lang.Throwable -> Lbd
        Lb0:
            monitor-exit(r6)
            return r0
        Lb2:
            r7 = 0
            r6.f = r7     // Catch: java.lang.Throwable -> Lbd
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r8 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lbd
            throw r7     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbd
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        nz nzVar = (nz) this.d.get(context);
        if (nzVar != null) {
            nzVar.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean h(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            r5 = this;
            agx r5 = r5.h
            r0 = 0
            if (r5 == 0) goto L6b
            java.lang.Object r1 = r5.d
            android.graphics.PorterDuff$Mode r2 = defpackage.gy.a
            int[] r1 = (int[]) r1
            boolean r1 = defpackage.agx.a(r1, r7)
            r3 = -1
            r4 = 1
            if (r1 == 0) goto L19
            r5 = 2130968847(0x7f04010f, float:1.754636E38)
        L16:
            r7 = r3
        L17:
            r1 = r4
            goto L54
        L19:
            java.lang.Object r1 = r5.a
            int[] r1 = (int[]) r1
            boolean r1 = defpackage.agx.a(r1, r7)
            if (r1 == 0) goto L27
            r5 = 2130968845(0x7f04010d, float:1.7546355E38)
            goto L16
        L27:
            java.lang.Object r5 = r5.f
            int[] r5 = (int[]) r5
            boolean r5 = defpackage.agx.a(r5, r7)
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            if (r5 == 0) goto L38
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L36:
            r5 = r1
            goto L16
        L38:
            r5 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r7 != r5) goto L4b
            r5 = 1109603123(0x42233333, float:40.8)
            int r5 = java.lang.Math.round(r5)
            r7 = 16842800(0x1010030, float:2.3693693E-38)
            r1 = r7
            r7 = r5
            r5 = r1
            goto L17
        L4b:
            r5 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r7 != r5) goto L51
            goto L36
        L51:
            r5 = r0
            r1 = r5
            r7 = r3
        L54:
            if (r1 == 0) goto L6b
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r5 = defpackage.kz.b(r6, r5)
            android.graphics.PorterDuffColorFilter r5 = defpackage.gy.b(r5, r2)
            r8.setColorFilter(r5)
            if (r7 == r3) goto L6a
            r8.setAlpha(r7)
        L6a:
            return r4
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp.h(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public final synchronized void i(agx agxVar) {
        this.h = agxVar;
    }
}
