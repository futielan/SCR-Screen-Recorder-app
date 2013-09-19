package com.iwobanas.screenrecorder.settings;

public enum VideoBitrate {
    BITRATE_AUTO(-1, "Auto"),
    BITRATE_500_KBPS(500000, "500kbps"),
    BITRATE_1_MBPS(1000000, "1Mbps"),
    BITRATE_2_MBPS(2000000, "2Mbps"),
    BITRATE_3_MBPS(3000000, "3Mbps"),
    BITRATE_5_MBPS(5000000, "5Mbps"),
    BITRATE_10_MBPS(10000000, "10Mbps"),
    BITRATE_15_MBPS(15000000, "15Mbps"),
    BITRATE_30_MBPS(30000000, "30Mbps");

    private int bitrate;
    private String label;

    VideoBitrate(int samplingRate, String label) {
        this.bitrate = samplingRate;
        this.label = label;
    }

    public String getCommand() {
        return String.valueOf(bitrate);
    }

    public String getLabel() {
        return label;
    }
}
