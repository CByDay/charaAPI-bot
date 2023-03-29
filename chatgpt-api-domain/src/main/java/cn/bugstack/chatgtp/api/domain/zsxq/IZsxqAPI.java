package cn.bugstack.chatgtp.api.domain.zsxq;

import cn.bugstack.chatgtp.api.domain.zsxq.model.aggregates.UnAnswerTopIdAggregates;

import java.io.IOException;

public interface IZsxqAPI {

    UnAnswerTopIdAggregates queryAnswerTopId(String groupId, String cookie) throws IOException;

    boolean answer(String groupId, String cookie, String topicId, String text, boolean silenced) throws IOException;
}
