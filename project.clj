(defproject rest-cljer "0.1.1"
  :description "A Clojure wrapper for the rest driver library"
  :url "https://github.com/whostolebenfrog/rest-cljer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [environ "0.3.0"]
                 [junit "4.10"]
                 [clj-http "0.5.2"]
                 [midje "1.4.0"]
                 [com.github.rest-driver/rest-client-driver "1.1.28" :exclusions [org.slf4j/slf4j-nop]]]

  :profiles {:dev {:plugins [[lein-rpm "0.0.4"]
                             [lein-midje "2.0.0-SNAPSHOT"]]}})
