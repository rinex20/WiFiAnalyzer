/*
 * WiFi Analyzer
 * Copyright (C) 2016  VREM Software Development <VREMSoftwareDevelopment@gmail.com>
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.vrem.wifianalyzer.navigation;

import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.about.AboutActivity;
import com.vrem.wifianalyzer.settings.SettingActivity;
import com.vrem.wifianalyzer.vendor.VendorFragment;
import com.vrem.wifianalyzer.wifi.AccessPointsFragment;
import com.vrem.wifianalyzer.wifi.ChannelRatingFragment;
import com.vrem.wifianalyzer.wifi.graph.channel.ChannelGraphFragment;
import com.vrem.wifianalyzer.wifi.graph.time.TimeGraphFragment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class NavigationMenuTest {

    @Test
    public void testNavigationMenu() throws Exception {
        assertEquals(8, NavigationMenu.values().length);
    }

    @Test
    public void testFind() throws Exception {
        assertEquals(NavigationMenu.ACCESS_POINTS, NavigationMenu.find(-1));
        assertEquals(NavigationMenu.ACCESS_POINTS, NavigationMenu.find(NavigationMenu.values().length));

        assertEquals(NavigationMenu.ACCESS_POINTS, NavigationMenu.find(NavigationMenu.ACCESS_POINTS.ordinal()));
        assertEquals(NavigationMenu.CHANNEL_RATING, NavigationMenu.find(NavigationMenu.CHANNEL_RATING.ordinal()));
        assertEquals(NavigationMenu.CHANNEL_GRAPH, NavigationMenu.find(NavigationMenu.CHANNEL_GRAPH.ordinal()));
        assertEquals(NavigationMenu.TIME_GRAPH, NavigationMenu.find(NavigationMenu.TIME_GRAPH.ordinal()));
        assertEquals(NavigationMenu.CHANNEL_AVAILABLE, NavigationMenu.find(NavigationMenu.CHANNEL_AVAILABLE.ordinal()));
        assertEquals(NavigationMenu.VENDOR_LIST, NavigationMenu.find(NavigationMenu.VENDOR_LIST.ordinal()));
        assertEquals(NavigationMenu.SETTINGS, NavigationMenu.find(NavigationMenu.SETTINGS.ordinal()));
        assertEquals(NavigationMenu.ABOUT, NavigationMenu.find(NavigationMenu.ABOUT.ordinal()));
    }

    @Test
    public void testGetFragment() throws Exception {
        assertTrue(NavigationMenu.ACCESS_POINTS.getFragment() instanceof AccessPointsFragment);
        assertTrue(NavigationMenu.CHANNEL_RATING.getFragment() instanceof ChannelRatingFragment);
        assertTrue(NavigationMenu.CHANNEL_GRAPH.getFragment() instanceof ChannelGraphFragment);
        assertTrue(NavigationMenu.TIME_GRAPH.getFragment() instanceof TimeGraphFragment);
        assertTrue(NavigationMenu.VENDOR_LIST.getFragment() instanceof VendorFragment);
        assertNull(NavigationMenu.SETTINGS.getFragment());
        assertNull(NavigationMenu.ABOUT.getFragment());
    }

    @Test
    public void testGetActivity() throws Exception {
        assertNull(NavigationMenu.ACCESS_POINTS.getActivity());
        assertNull(NavigationMenu.CHANNEL_RATING.getActivity());
        assertNull(NavigationMenu.CHANNEL_GRAPH.getActivity());
        assertNull(NavigationMenu.TIME_GRAPH.getActivity());
        assertNull(NavigationMenu.VENDOR_LIST.getActivity());
        assertEquals(SettingActivity.class, NavigationMenu.SETTINGS.getActivity());
        assertEquals(AboutActivity.class, NavigationMenu.ABOUT.getActivity());
    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals(R.string.action_access_points, NavigationMenu.ACCESS_POINTS.getTitle());
        assertEquals(R.string.action_channel_rating, NavigationMenu.CHANNEL_RATING.getTitle());
        assertEquals(R.string.action_channel_graph, NavigationMenu.CHANNEL_GRAPH.getTitle());
        assertEquals(R.string.action_time_graph, NavigationMenu.TIME_GRAPH.getTitle());
        assertEquals(R.string.action_vendors, NavigationMenu.VENDOR_LIST.getTitle());
        assertEquals(R.string.action_settings, NavigationMenu.SETTINGS.getTitle());
        assertEquals(R.string.action_about, NavigationMenu.ABOUT.getTitle());
    }

    @Test
    public void testIsWiFiBandSwitchableTrue() throws Exception {
        assertTrue(NavigationMenu.ACCESS_POINTS.isWiFiBandSwitchable());
        assertTrue(NavigationMenu.CHANNEL_RATING.isWiFiBandSwitchable());
        assertTrue(NavigationMenu.CHANNEL_GRAPH.isWiFiBandSwitchable());
        assertTrue(NavigationMenu.TIME_GRAPH.isWiFiBandSwitchable());
    }

    @Test
    public void testIsWiFiBandSwitchableFalse() throws Exception {
        assertFalse(NavigationMenu.VENDOR_LIST.isWiFiBandSwitchable());
        assertFalse(NavigationMenu.SETTINGS.isWiFiBandSwitchable());
        assertFalse(NavigationMenu.ABOUT.isWiFiBandSwitchable());
    }

    @Test
    public void testGetIcon() throws Exception {
        assertEquals(R.drawable.ic_network_wifi_grey_500_48dp, NavigationMenu.ACCESS_POINTS.getIcon());
        assertEquals(R.drawable.ic_wifi_tethering_grey_500_48dp, NavigationMenu.CHANNEL_RATING.getIcon());
        assertEquals(R.drawable.ic_insert_chart_grey_500_48dp, NavigationMenu.CHANNEL_GRAPH.getIcon());
        assertEquals(R.drawable.ic_show_chart_grey_500_48dp, NavigationMenu.TIME_GRAPH.getIcon());
        assertEquals(R.drawable.ic_list_grey_500_48dp, NavigationMenu.VENDOR_LIST.getIcon());
        assertEquals(R.drawable.ic_settings_grey_500_48dp, NavigationMenu.SETTINGS.getIcon());
        assertEquals(R.drawable.ic_info_outline_grey_500_48dp, NavigationMenu.ABOUT.getIcon());
    }
}