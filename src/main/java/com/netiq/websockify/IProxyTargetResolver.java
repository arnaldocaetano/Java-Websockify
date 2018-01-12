package com.netiq.websockify;

import java.net.InetSocketAddress;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelEvent;

public interface IProxyTargetResolver {

	public InetSocketAddress resolveTarget (Channel channel, ChannelEvent channelEvent);

}
