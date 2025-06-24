package org.mrdarkimc.sataniccore.notifier;


public abstract class Notify<Receiver> implements INotify<Receiver> {
    NotifyType type = NotifyTypes.ECO_PAID_FROM_PLAYER;
    boolean enable;
}
