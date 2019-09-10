package phamtanphat.ptp.khoaphamtraining.intentdata02072019;

import android.os.Parcel;
import android.os.Parcelable;

public class Sinhvien implements Parcelable {
    String ten;

    public Sinhvien(String ten) {
        this.ten = ten;
    }

    protected Sinhvien(Parcel in) {
        ten = in.readString();
    }

    public static final Creator<Sinhvien> CREATOR = new Creator<Sinhvien>() {
        @Override
        public Sinhvien createFromParcel(Parcel in) {
            return new Sinhvien(in);
        }

        @Override
        public Sinhvien[] newArray(int size) {
            return new Sinhvien[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ten);
    }
}
