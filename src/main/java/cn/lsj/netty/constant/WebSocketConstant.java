package cn.lsj.netty.constant;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GlobalEventExecutor;

public class WebSocketConstant {

    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    public static final AttributeKey<WebSocketServerHandshaker> ATTR_HANDSHAKE = AttributeKey.newInstance("ATTR_HANDSHAKE");
    public final static String WEBSOCKET= "websocket";
    public final static String GET= "GET";
    public final static String HOST= "Host";
    public final static String CONNECTION= "Connection";
    public final static String UPGRADE= "Upgrade";
    public final static String SEC_WEBSOCKET_VERSION= "Sec-WebSocket-Version";
    public final static String SEC_WEBSOCKET_KEY= "Sec-WebSocket-Key";
    public static String WEB_SOCKET_URL="ws:///%s:/%d/%s";
}