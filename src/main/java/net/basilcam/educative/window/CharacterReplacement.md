

initial state
-------------

a a b c c b b
s
e

k: 2
map: <empty>
maxLength: 0
maxRepeat: 0

step 1
------

a a b c c b b
s
e


windowStart = 0
windowEnd = 0

map: 
- a: 1

freq = 1
maxRepeat: max(maxRepeat, freq) = max(0, 1) = 1

windowSize = windowEnd - windowStart + 1 = 0 - 0 + 1 = 1
requiredReplacements = windowSize - maxRepeat = 1 - 1 = 0;

don't move windowStart since requiredReplacements <= k

windowSize = windowEnd - windowStart + 1 = 0 - 0 + 1 = 1
maxLength = max(maxLength, windowSize) = max(0, 1) = 1


step 2
------

a a b c c b b
s
  e

windowStart = 0
windowEnd = 1

map:
- a: 2

freq = 2
maxRepeat = max(maxRepeat, freq) = max(1, 2) = 2

windowSize = windowEnd - windowStart + 1 = 1 - 0 + 1 = 2
requiredReplacements = windowSize - maxRepeat = 2 - 2 = 0

don't move windowStart since requiredReplacements <= k

windowSize = windowEnd - windowStart + 1 = 1 - 0 + 1 = 2
maxLength = max(maxLength, windowSize) = max(1, 2) = 2


step 3
------

a a b c c b b
s
    e

windowStart = 0
windowEnd = 2

map:
- a: 2
- b: 1

freq = 1
maxRepeat = max(maxRepeat, freq) = max(2, 1) = 2

windowSize = windowEnd - windowStart + 1 = 2 - 0 + 1 = 3
requiredReplacements = windowSize - maxRepeat = 3 - 2 = 1

don't move windowStart since requiredReplacements <= k

windowSize = windowEnd - windowStart + 1 = 2 - 0 + 1 = 3
maxLength = max(maxLength, windowSize) = max(2, 3) = 3


step 4
------

a a b c c b b
s
      e

windowStart = 0
windowEnd = 3

map:
- a: 2
- b: 1
- c: 1

freq = 1
maxRepeat = max(maxRepeat, freq) = max(2, 1) = 2

windowSize = windowEnd - windowStart + 1 = 3 - 0 + 1 = 4
requiredReplacements = windowSize - maxRepeat = 4 - 2 = 2

don't move windowStart since requiredReplacements <= k

windowSize = windowEnd - windowStart + 1 = 3 - 0 + 1 = 4
maxLength = max(maxLength, windowSize) = max(3, 4) = 4


step 5
------

a a b c c b b
s
        e

windowStart = 0
windowEnd = 4

map:
- a: 2
- b: 1
- c: 2

freq = 2
maxRepeat = max(maxRepeat, freq) = max(2, 1) = 2

windowSize = windowEnd - windowStart + 1 = 4 - 0 + 1 = 5
requiredReplacements = windowSize - maxRepeat = 5 - 2 = 3

do move windowStart since requiredReplacements > k
    map:
    - a: 1
    - b: 1
    - c: 2
    windowStart = 1

windowSize = windowEnd - windowStart + 1 = 4 - 1 + 1 = 4
maxLength = max(maxLength, windowSize) = max(4, 4) = 4


step 6
------

a a b c c b b
  s
          e

windowStart = 1
windowEnd = 5

map:
- a: 1
- b: 2
- c: 2

freq = 2
maxRepeat = max(maxRepeat, freq) = max(2, 2) = 2

windowSize = windowEnd - windowStart + 1 = 5 - 1 + 1 = 5
requiredReplacements = windowSize - maxRepeat = 5 - 2 = 3

do move windowStart since requiredReplacements > k
    map:
    - a: 0
    - b: 2
    - c: 2
    windowStart = 2

windowSize = windowEnd - windowStart + 1 = 5 - 2 + 1 = 4
maxLength = max(maxLength, windowSize) = max(4, 4) = 4


step 7
------

a a b c c b b
    s
            e

windowStart = 2
windowEnd = 6

map:
- a: 0
- b: 3
- c: 2

freq = 3
maxRepeat = max(maxRepeat, freq) = max(2, 3) = 3

windowSize = windowEnd - windowStart + 1 = 6 - 2 + 1 = 5
requiredReplacements = windowSize - maxRepeat = 5 - 3 = 2

don't move windowStart since requiredReplacements <= k

windowSize = windowEnd - windowStart + 1 = 6 - 2 + 1 = 5
maxLength = max(maxLength, windowSize) = max(4, 5) = 5





a a c b c b b
