/*
 * Copyright (C) 2019 Qunar, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package qunar.tc.bistoury.proxy.communicate;

import io.netty.channel.ChannelHandlerContext;
import qunar.tc.bistoury.remoting.protocol.Datagram;

import java.util.Set;

/**
 * @author zhenyu.nie created on 2019 2019/5/14 17:15
 */
public interface MessageProcessor {

    Set<Integer> codes();

    void process(ChannelHandlerContext ctx, Datagram message);
}
