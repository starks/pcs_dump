package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Category extends bmr {
    public static final Parcelable.Creator CREATOR = new CategoryParcelableCreator();
    private final String categoryName;
    private final int index;
    private final float score;

    public Category(String str, int i, float f) {
        this.categoryName = str;
        this.index = i;
        this.score = f;
    }

    public static Category create(String str, int i, float f) {
        return new Category(str, i, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return this.categoryName.equals(category.categoryName) && this.index == category.index && this.score == category.score;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public int getIndex() {
        return this.index;
    }

    public float getScore() {
        return this.score;
    }

    public int hashCode() {
        return Objects.hash(this.categoryName, Integer.valueOf(this.index), Float.valueOf(this.score));
    }

    public String toString() {
        return "Category{categoryName='" + this.categoryName + "', index=" + this.index + ", score=" + this.score + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CategoryParcelableCreator.writeToParcel(this, parcel, i);
    }
}
