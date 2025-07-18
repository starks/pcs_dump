package com.google.android.gms.common;

import defpackage.bht;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        super("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + bht.c + " but found " + i + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
