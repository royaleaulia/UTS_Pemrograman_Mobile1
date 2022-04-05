package com.example.affirmations.model
import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(stringResourceId)
        parcel.writeInt(imageResourceId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Affirmation> {
        override fun createFromParcel(parcel: Parcel): Affirmation {
            return Affirmation(parcel)
        }

        override fun newArray(size: Int): Array<Affirmation?> {
            return arrayOfNulls(size)
        }
    }

}

