package com.d.music.data.database.greendao.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.d.lib.rxnet.callback.ProgressCallback;

/**
 * Entity mapped to table "TRANSFER_MODEL".
 */
public class TransferModel extends MusicModel {
    public final static int TRANSFER_TYPE_NONE = 100;
    public final static int TRANSFER_TYPE_SONG = 101;
    public final static int TRANSFER_TYPE_MV = 102;
    public final static int TRANSFER_TYPE_HEAD_NOT = 103;
    public final static int TRANSFER_TYPE_HEAD_DONE = 104;

    public final static int TRANSFER_STATE_PROGRESS = 0;
    public final static int TRANSFER_STATE_PENDDING = 1;
    public final static int TRANSFER_STATE_ERROR = 2;
    public final static int TRANSFER_STATE_DONE = 3;

    public String transferId = "";
    public Integer transferType = TRANSFER_TYPE_NONE;
    public Integer transferState = TRANSFER_STATE_PENDDING;
    public Integer transferCurrentLength = 0;
    public Integer transferTotalLength = 0;

    /**
     * Extra: Not in the database
     */
    // Extra properties: Transmission speed
    public long transferSpeed;
    // Extra properties: Transmission ProgressCallback
    public ProgressCallback progressCallback;

    public void setProgressCallback(ProgressCallback l) {
        progressCallback = l;
    }

    public static String generateId(@NonNull MusicModel model) {
        if (model instanceof TransferModel) {
            return ((TransferModel) model).transferId;
        }
        return "" + TRANSFER_TYPE_NONE + model.type + (!TextUtils.isEmpty(model.songId) ? model.songId : "");
    }

    public static String generateId(int transferType, int type, String id) {
        return "" + transferType + type + (!TextUtils.isEmpty(id) ? id : "");
    }

    public TransferModel() {
    }

    public TransferModel(String transferId) {
        this.transferId = transferId;
    }

    public TransferModel(MusicModel model) {
        this("", TRANSFER_TYPE_NONE, TRANSFER_STATE_PENDDING, 0, 0,
                model.url, model.type, model.seq, model.songId, model.songName,
                model.artistId, model.artistName,
                model.albumId, model.albumName, model.albumUrl,
                model.lrcName, model.lrcUrl,
                model.fileDuration, model.fileSize, model.filePostfix, model.fileFolder,
                model.isCollected, model.timeStamp);
    }

    public TransferModel(String transferId, Integer transferType, Integer transferState, Integer transferCurrentLength, Integer transferTotalLength, String url, Integer type, Integer seq, String songId, String songName, String artistId, String artistName, String albumId, String albumName, String albumUrl, String lrcName, String lrcUrl, Long fileDuration, Long fileSize, String filePostfix, String fileFolder, Boolean isCollected, Long timeStamp) {
        this.transferId = transferId;
        this.transferType = transferType;
        this.transferState = transferState;
        this.transferCurrentLength = transferCurrentLength;
        this.transferTotalLength = transferTotalLength;

        this.url = url;
        this.type = type;
        this.seq = seq;
        this.songId = songId;
        this.songName = songName;
        this.artistId = artistId;
        this.artistName = artistName;
        this.albumId = albumId;
        this.albumName = albumName;
        this.albumUrl = albumUrl;
        this.lrcName = lrcName;
        this.lrcUrl = lrcUrl;
        this.fileDuration = fileDuration;
        this.fileSize = fileSize;
        this.filePostfix = filePostfix;
        this.fileFolder = fileFolder;
        this.isCollected = isCollected;
        this.timeStamp = timeStamp;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public Integer getTransferState() {
        return transferState;
    }

    public void setTransferState(Integer transferState) {
        this.transferState = transferState;
    }

    public Integer getTransferCurrentLength() {
        return transferCurrentLength;
    }

    public void setTransferCurrentLength(Integer transferCurrentLength) {
        this.transferCurrentLength = transferCurrentLength;
    }

    public Integer getTransferTotalLength() {
        return transferTotalLength;
    }

    public void setTransferTotalLength(Integer transferTotalLength) {
        this.transferTotalLength = transferTotalLength;
    }
}