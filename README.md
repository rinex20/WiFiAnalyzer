# WiFi Analyzer (open-source) for Android 5.1+

Optimize your WiFi network using WiFi Analyzer (open-source) by examining surrounding WiFi networks, measuring their signal strength as well as identifying crowded channels.

#### Note for Android OS 6 Users:
Some users running Android OS 6 (Marshmallow) have reported that the location service must be enabled for the application to see WiFi networks. Marshmallow users may need to turn on the location service, even though WiFi Analyzer does not explicitly require it. [This appears to be attributed to a potential issue in Android OS 6 that requires location service in order to see WiFi networks](https://github.com/VREMSoftwareDevelopment/WiFiAnalyzer/issues/23).

[<img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" alt="Get it on Google Play" height="100">](https://play.google.com/store/apps/details?id=com.vrem.wifianalyzer)
[<img src="https://f-droid.org/badge/get-it-on.png" alt="Get it on F-Droid" height="100">](https://f-droid.org/repository/browse/?fdid=com.vrem.wifianalyzer)

This is the official repository of WiFi Analyzer (open-source).

<img src="https://github.com/VREMSoftwareDevelopment/WiFiAnalyzer/raw/master/screenshots/feature-graphic.png" alt="Feature Graphic" height="300">

## Features:
* Identify nearby Access Points
* Graph channels signal strength
* Graph Access Point signal strength over time
* Analyze WiFi networks to rate channels
 
## Usage Tips:
* Tap the title bar to switch between 2.4 and 5 GHz WiFi band.
* Swipe to manually refresh screen content.
* SSID with (***) means it is hidden.
* Distance to the Access Point is estimated.

## How-to:
* [How to guide in Czech](http://www.svetandroida.cz/aplikace-wifi-analyzer-open-source-201605)
* [Why Wi-Fi Stinks and How to Fix It](http://spectrum.ieee.org/telecom/wireless/why-wifi-stinksand-how-to-fix-it)
* [Wikipedia WiFi channels list](https://en.wikipedia.org/wiki/List_of_WLAN_channels)

## Feedback:
Bug reports and feature requests can be submitted [here](https://github.com/VREMSoftwareDevelopment/WiFiAnalyzer/issues) or use [google groups](https://groups.google.com/forum/#!forum/wifi-analyzer-open-source) to discuss application features if you do not have GitHub account.

## License:
WiFi Analyzer is licensed under the GNU General Public License v3.0 (GNU GPLv3).

You can find the license text [here](http://www.gnu.org/licenses/gpl-3.0.html).

## Build WiFi Analyzer:

Travis CI status [![Build Status](https://travis-ci.org/VREMSoftwareDevelopment/WiFiAnalyzer.svg?branch=master)](https://travis-ci.org/VREMSoftwareDevelopment/WiFiAnalyzer)

Codacy analysis [![Codacy Badge](https://api.codacy.com/project/badge/grade/203eaa0583694bcca6554190513179ba)](https://www.codacy.com/app/vremsoftwaredevelopment/WiFiAnalyzer)

Codecov [![codecov](https://codecov.io/gh/VREMSoftwareDevelopment/WiFiAnalyzer/branch/master/graph/badge.svg)](https://codecov.io/gh/VREMSoftwareDevelopment/WiFiAnalyzer)

Dependency Status [![Dependency Status](https://www.versioneye.com/user/projects/5774046699ed290049b8bb59/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/5774046699ed290049b8bb59)

GitHub Stats [![Issues](https://img.shields.io/github/issues/VREMSoftwareDevelopment/WiFiAnalyzer.svg)](https://github.com/VREMSoftwareDevelopment/WiFiAnalyzer/issues)
[![Star](https://img.shields.io/github/stars/VREMSoftwareDevelopment/WiFiAnalyzer.svg)](https://github.com/VREMSoftwareDevelopment/WiFiAnalyzer/stargazers)
[![Fork](https://img.shields.io/github/forks/VREMSoftwareDevelopment/WiFiAnalyzer.svg)](https://github.com/VREMSoftwareDevelopment/WiFiAnalyzer/network)


### Fork project
[How to fork project](https://help.github.com/articles/fork-a-repo)
### Build project
  1. Install Android Studio
  2. Import project into Android Studio
      * In Welcome to Android Studio Screen select Import project ...
      * Select the root directory of the WiFi Analyzer repository and click "OK".
      * WiFi Analyzer will build automatically
