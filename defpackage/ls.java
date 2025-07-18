package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.aicore.aidl.AIFeature;
import j$.time.ZoneOffset;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ls implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ls(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        Object obj;
        switch (this.b) {
            case 0:
                ((lx) this.a).invalidateOptionsMenu();
                return;
            case 1:
                ((Toolbar) this.a).z();
                return;
            case 2:
                lv lvVar = (lv) this.a;
                Runnable runnable = lvVar.a;
                if (runnable != null) {
                    runnable.run();
                    lvVar.a = null;
                    return;
                }
                return;
            case 3:
                try {
                    super/*bz*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!fjs.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!fjs.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 4:
                ly.f((ly) this.a);
                return;
            case 5:
                wg wgVar = (wg) this.a;
                if (wgVar.e) {
                    if (wgVar.c) {
                        wgVar.c = false;
                        wf wfVar = wgVar.a;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        wfVar.e = jCurrentAnimationTimeMillis;
                        wfVar.i = -1L;
                        wfVar.f = jCurrentAnimationTimeMillis;
                        wfVar.j = 0.5f;
                        wfVar.g = 0;
                        wfVar.h = 0;
                    }
                    wf wfVar2 = ((wg) this.a).a;
                    if ((wfVar2.i > 0 && AnimationUtils.currentAnimationTimeMillis() > wfVar2.i + wfVar2.k) || !((wg) this.a).b()) {
                        ((wg) this.a).e = false;
                        return;
                    }
                    wg wgVar2 = (wg) this.a;
                    if (wgVar2.d) {
                        wgVar2.d = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        wgVar2.b.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (wfVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = wfVar2.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - wfVar2.f;
                    wfVar2.f = jCurrentAnimationTimeMillis2;
                    float f = j * (((-4.0f) * fA * fA) + (fA * 4.0f));
                    wfVar2.g = (int) (wfVar2.c * f);
                    int i = (int) (f * wfVar2.d);
                    wfVar2.h = i;
                    ((wg) this.a).d(i);
                    Object obj2 = this.a;
                    int[] iArr = ut.a;
                    ((wg) obj2).b.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                ((ws) this.a).f(0);
                return;
            case 7:
                fuu fuuVar = ((wx) this.a).i;
                ((wx) fuuVar.a).d = SystemClock.uptimeMillis();
                wx wxVar = (wx) fuuVar.a;
                long j2 = wxVar.d;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                for (int i2 = 0; i2 < wxVar.b.size(); i2++) {
                    wt wtVar = (wt) wxVar.b.get(i2);
                    if (wtVar != null) {
                        Long l = (Long) wxVar.a.get(wtVar);
                        if (l == null) {
                            wtVar.a(j2);
                        } else if (l.longValue() < jUptimeMillis2) {
                            wxVar.a.remove(wtVar);
                            wtVar.a(j2);
                        }
                    }
                }
                if (wxVar.e) {
                    int size = wxVar.b.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            if (wxVar.b.size() == 0) {
                                wv wvVar = wxVar.g;
                                ValueAnimator.unregisterDurationScaleChangeListener(wvVar.a);
                                wvVar.a = null;
                            }
                            wxVar.e = false;
                        } else if (wxVar.b.get(size) == null) {
                            wxVar.b.remove(size);
                        }
                    }
                }
                if (((wx) fuuVar.a).b.size() > 0) {
                    wx wxVar2 = (wx) fuuVar.a;
                    wxVar2.h.g(wxVar2.c);
                    return;
                }
                return;
            case 8:
                synchronized (((zh) this.a).b) {
                    obj = ((zh) this.a).f;
                    ((zh) this.a).f = zh.a;
                }
                ((zh) this.a).i(obj);
                return;
            case 9:
                aay aayVar = (aay) this.a;
                long j3 = aayVar.ad;
                if (j3 == -1 || j3 + 1000 <= SystemClock.currentThreadTimeMillis()) {
                    return;
                }
                EditText editText = aayVar.ab;
                if (editText == null || !editText.isFocused()) {
                    aayVar.an(false);
                    return;
                } else if (((InputMethodManager) aayVar.ab.getContext().getSystemService("input_method")).showSoftInput(aayVar.ab, 0)) {
                    aayVar.an(false);
                    return;
                } else {
                    aayVar.ab.removeCallbacks(aayVar.ac);
                    aayVar.ab.postDelayed(aayVar.ac, 50L);
                    return;
                }
            case 10:
                RecyclerView recyclerView = ((abp) this.a).a;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 11:
                ((abs) this.a).h();
                return;
            case 12:
                Object obj3 = this.a;
                adi adiVar = (adi) obj3;
                AtomicBoolean atomicBoolean = adiVar.h;
                boolean zJ = ((zh) obj3).j();
                if (atomicBoolean.compareAndSet(false, true) && zJ) {
                    fjp.q(adiVar.g.h(), adiVar.i, new acr(adiVar, (fhk) null, 2), 2);
                    return;
                }
                return;
            case 13:
                ((SwipeRefreshLayout) this.a).b();
                return;
            case 14:
                ((amp) this.a).a("AICore<>PCS Connection cancelled, likely timed-out.", false);
                return;
            case 15:
                aqq aqqVar = (aqq) this.a;
                if (((ang) aqqVar.a.b()).f()) {
                    int minute = api.b().atZone(ZoneOffset.UTC).toLocalTime().getMinute();
                    if (minute == 59) {
                        if (r0.getSecond() < 60 - ((ang) aqqVar.a.b()).a()) {
                            return;
                        }
                    } else if (minute != 0 || r0.getSecond() >= ((ang) aqqVar.a.b()).a()) {
                        return;
                    }
                    try {
                        new CountDownLatch(1).await((long) ((((ang) aqqVar.a.b()).b() - ((ang) aqqVar.a.b()).c()) * aqqVar.b.nextDouble()), TimeUnit.SECONDS);
                        return;
                    } catch (InterruptedException e3) {
                        throw new IllegalStateException(e3);
                    }
                }
                return;
            case 16:
                asw aswVar = (asw) this.a;
                asx.d(aswVar.c, aswVar.b, 1, aswVar.a.get());
                return;
            case 17:
                asw aswVar2 = (asw) this.a;
                asx.d(aswVar2.c, aswVar2.b, 2, aswVar2.a.get());
                return;
            case 18:
                asw aswVar3 = (asw) this.a;
                asx.d(aswVar3.c, aswVar3.b, 2, aswVar3.a.get());
                return;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                ((awz) this.a).d.i(false);
                return;
            default:
                ((bkb) this.a).h();
                return;
        }
    }

    public ls(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
