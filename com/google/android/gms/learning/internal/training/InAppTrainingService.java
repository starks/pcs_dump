package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import defpackage.bpe;
import defpackage.buq;
import defpackage.buv;
import defpackage.bux;
import defpackage.bvf;
import defpackage.bwd;
import defpackage.bwe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    bwd dynamiteImpl;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        bwd bwdVar = this.dynamiteImpl;
        if (bwdVar != null) {
            try {
                return bwdVar.onBind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onBind", e);
                }
            }
        }
        return new buq("No IInAppTrainingService implementation found");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            bwd bwdVar = (bwd) bux.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", new bwe(3));
            try {
                bwdVar.onCreate(new bpe(this));
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during onCreate", e);
                }
            }
            try {
                bwdVar.addHttpUrlConnectionFactory("cronet", new bvf(getApplicationContext()));
            } catch (RemoteException e2) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during addHttpUrlConnectionFactory", e2);
                }
            }
            this.dynamiteImpl = bwdVar;
        } catch (buv e3) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during onCreate", e3);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        bwd bwdVar = this.dynamiteImpl;
        if (bwdVar != null) {
            try {
                bwdVar.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        bwd bwdVar = this.dynamiteImpl;
        if (bwdVar != null) {
            try {
                bwdVar.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        bwd bwdVar = this.dynamiteImpl;
        if (bwdVar != null) {
            try {
                return bwdVar.onStartCommand(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        bwd bwdVar = this.dynamiteImpl;
        if (bwdVar != null) {
            try {
                bwdVar.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onTrimMemory", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        bwd bwdVar = this.dynamiteImpl;
        if (bwdVar != null) {
            try {
                return bwdVar.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
