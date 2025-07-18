package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhs extends bht {
    private static final Object e = new Object();
    public static final bhs a = new bhs();
    public static final int b = bht.c;

    public final void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        bhp bhpVar = new bhp();
        aso.G(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        bhpVar.a = dialog;
        bhpVar.b = onCancelListener;
        bhpVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    @Override // defpackage.bht
    public final PendingIntent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    public final void c(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        Bundle bundle;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new bhr(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? bli.e(context, "common_google_play_services_resolution_required_title") : bli.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? bli.d(context, "common_google_play_services_resolution_required_text", bli.a(context)) : bli.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        aso.F(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        ri riVar = new ri(context);
        riVar.k = true;
        riVar.o.flags |= 16;
        riVar.e = ri.b(strE);
        rh rhVar = new rh();
        rhVar.a = ri.b(strD);
        riVar.d(rhVar);
        boolean zA = bnd.a(context);
        int i3 = android.R.drawable.stat_sys_warning;
        if (zA) {
            aso.C(true);
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            riVar.c(i3);
            riVar.h = 2;
            if (bnd.c(context)) {
                riVar.b.add(new rg(IconCompat.b(null, "", R.drawable.common_full_open_on_phone), resources.getString(R.string.common_open_on_phone), pendingIntent, new Bundle(), null, true, true));
            } else {
                riVar.g = pendingIntent;
            }
        } else {
            riVar.c(android.R.drawable.stat_sys_warning);
            riVar.o.tickerText = ri.b(resources.getString(R.string.common_google_play_services_notification_ticker));
            riVar.o.when = System.currentTimeMillis();
            riVar.g = pendingIntent;
            riVar.f = ri.b(strD);
        }
        aso.C(true);
        synchronized (e) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        riVar.m = "com.google.android.gms.availability";
        fcy fcyVar = new fcy(riVar);
        rj rjVar = ((ri) fcyVar.b).j;
        if (rjVar != null) {
            rjVar.b(fcyVar);
        }
        Notification notificationBuild = ((Notification.Builder) fcyVar.c).build();
        if (rjVar != null && (bundle = notificationBuild.extras) != null) {
            rjVar.c(bundle);
        }
        if (i == 1 || i == 2 || i == 3) {
            bio.c.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationBuild);
    }
}
