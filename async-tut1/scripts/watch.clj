(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'async-tut1.core
   :output-to "out/async_tut1.js"
   :output-dir "out"})
