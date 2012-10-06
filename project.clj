(defproject hiccup "2.0.0-SNAPSHOT"
  :description "A fast library for rendering HTML in Clojure"
  :url "http://github.com/weavejester/hiccup"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/core.match "0.2.0-alpha11"]]
  :plugins [[codox "0.6.1"]]
  :codox {:exclude [hiccup.compiler]}
  :profiles
  {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
   :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}})
