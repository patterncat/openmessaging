package io.openmessaging;

/**
 * @author vintagewang@apache.org
 * @author yukon@apache.org
 * @version OMS 1.0
 * @since OMS 1.0
 */
public interface SequenceBatchMessageSender {
    void send(Message message);

    void send(Message message, KeyValue properties);

    void commit();

    void rollback();

    void close();
}
