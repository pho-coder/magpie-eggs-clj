(defproject com.jd.bdp.magpie.magpie-eggs-clj/magpie-test-plumber-task "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [com.jd.bdp.magpie/magpie-framework-clj "0.1.0-SNAPSHOT"]]
  :main ^:skip-aot com.jd.bdp.magpie.magpie-eggs-clj.magpie-test-plumber-task.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
