(defproject cljburst "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :java-source-paths ["src/java"]
  :resource-paths ["burstcoin/burst.jar"
                   ; XXX horrible hack for now.  
                   "burstcoin/lib/bcprov-jdk15on-151.jar"
                   "burstcoin/lib/h2-1.3.176.jar"
                   "burstcoin/lib/jetty-continuation-9.2.3.v20140905.jar"
                   "burstcoin/lib/jetty-http-9.2.3.v20140905.jar"
                   "burstcoin/lib/jetty-io-9.2.3.v20140905.jar"
                   "burstcoin/lib/jetty-security-9.2.3.v20140905.jar"
                   "burstcoin/lib/jetty-server-9.2.3.v20140905.jar"
                   "burstcoin/lib/jetty-servlet-9.2.3.v20140905.jar"
                   "burstcoin/lib/jetty-servlets-9.2.3.v20140905.jar"
                   "burstcoin/lib/jetty-util-9.2.3.v20140905.jar"
                   "burstcoin/lib/json-simple-1.1.1.jar"
                   "burstcoin/lib/servlet-api-3.1.jar"
                   "burstcoin/lib/slf4j-api-1.7.7.jar"
                   "burstcoin/lib/slf4j-jdk14-1.7.7.jar"
                   ]  
  :main ^:skip-aot cljburst.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
