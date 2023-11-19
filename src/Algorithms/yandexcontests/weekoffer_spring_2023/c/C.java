package Algorithms.yandexcontests.weekoffer_spring_2023.c;


import java.util.*;

/**
 *
 * Почему-то задача зашла на C++, Но не на Java.
 * Решение на C++ ниже
 *
 *
 * #include <iostream>
 * #include <set>
 * #include <unordered_map>
 * #define int long long
 *
 * bool comp(const std::pair<std::string, int>& l, const std::pair<std::string, int>& r)  {
 *     return l.second < r.second || (l.second == r.second && l.first < r.first);
 * };
 *
 * signed main(){
 *     std::ios::sync_with_stdio(0);
 *     std::cin.tie(0);
 *     std::cout.tie(0);
 *     int n = 0;
 *     std::cin >> n;
 *     std::set<std::pair<std::string, int>, bool (*) (const std::pair<std::string, int>&, const std::pair<std::string, int>&)> set(comp);
 *     std:: string name;
 *     int time = 0;
 *     std::cin >> name >> time;
 *     int lastTime = time;
 *     std::unordered_map<std::string, int> nameToTime;
 *     std::unordered_map<std::string, int> experience;
 *     int count = 1;
 *     int sum = 0;
 *     std::cout << name << " " << 0 << "\n";
 *     nameToTime[name] = time;
 *     set.insert({name, time});
 *     for(int i = 0; i < n - 1; i++){
 *         std::cin >> name >> time;
 *         sum += count * (time - lastTime);
 *         if(nameToTime.find(name) != nameToTime.end()) {
 *             set.erase({name, nameToTime[name]});
 *             sum -= time - nameToTime[name]; //??????
 *             experience[name] = time - nameToTime[name];
 *             nameToTime.erase(name);
 *             count--;
 *         }
 *         else {
 *             if(experience.find(name) != experience.end()){
 *                 set.insert({name, time - experience[name]});
 *                 sum += experience[name];
 *                 nameToTime[name] = time - experience[name];
 *             }
 *             else {
 *                 set.insert({name, time});
 *                 nameToTime[name] = time;
 *             }
 *
 *             count++;
 *         }
 *
 *         auto best = set.begin();
 *         std::cout << best->first << " " << sum - 2 * (time - best->second) << "\n";
 *         lastTime = time;
 *     }
 * }
 */

public class C {
    static class Pair implements Comparable<Pair> {
        String first;
        int second;

        Pair(String first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.second != other.second) {
                return Long.compare(this.second, other.second);
            }
            return this.first.compareTo(other.first);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int n = scanner.nextInt();
        TreeSet<Pair> set = new TreeSet<>();
        String name = scanner.next();
        int time = scanner.nextInt();
        int lastTime = time;
        HashMap<String, Integer> nameToTime = new HashMap<>();
        HashMap<String, Integer> experience = new HashMap<>();
        int count = 1;
        int sum = 0;
        System.out.println(name + " " + 0);
        nameToTime.put(name, time);
        set.add(new Pair(name, time));

        for (int i = 0; i < n - 1; i++) {
            name = scanner.next();
            time = scanner.nextInt();
            sum += count * (time - lastTime);

            if (nameToTime.containsKey(name)) {
                set.remove(new Pair(name, nameToTime.get(name)));
                sum -= time - nameToTime.get(name);
                experience.put(name, time - nameToTime.get(name));
                nameToTime.remove(name);
                count--;
            } else {
                if (experience.containsKey(name)) {
                    set.add(new Pair(name, time - experience.get(name)));
                    sum += experience.get(name);
                    nameToTime.put(name, time - experience.get(name));
                } else {
                    set.add(new Pair(name, time));
                    nameToTime.put(name, time);
                }
                count++;
            }

            Pair best = set.first();
            System.out.println(best.first + " " + (sum - 2 * (time - best.second)));
            lastTime = time;
        }
    }
}
