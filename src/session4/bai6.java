//package session4;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class bai6 {
//
//        public static void main(String[] args) {
//            // 1) blacklist từ nhạy cảm
//            List<String> blacklist = Arrays.asList(
//                    "ngu", "dcm", "dit", "lon", "shit", "fuck"
//            );
//
//            String review = "Shop giao hàng nhanh nhưng thằng shipper nói ngu vãi. " +
//                    "Mình rất bực, thái độ như shit vậy. Nhưng sản phẩm ok nhé! " +
//                    "Đoạn này thêm cho dài hơn 200 ký tự: abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc.";
//
//            String filtered = censor(review, blacklist);
//            String shortText = shorten(filtered, 200);
//
//            System.out.println("=== sau khi lọc ===");
//            System.out.println(filtered);
//            System.out.println("\n=== sau khi rút gọn (nếu >200) ===");
//            System.out.println(shortText);
//        }
//
//        // 2) dùng regex tìm từ trong blacklist (không phân biệt hoa thường) và thay bằng *** theo độ dài
//        static String censor(String text, List<String> blacklist) {
//            if (text == null || text.isEmpty() || blacklist == null || blacklist.isEmpty()) return text;
//
//            // escape để blacklist có ký tự đặc biệt vẫn an toàn
//            List<String> escaped = new ArrayList<>();
//            for (String w : blacklist) escaped.add(Pattern.quote(w));
//
//            // \b để match nguyên từ (tránh dính trong từ dài)
//            String patternStr = "\\b(" + String.join("|", escaped) + ")\\b";
//            Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//
//            Matcher m = pattern.matcher(text);
//            StringBuffer sb = new StringBuffer();
//
//            while (m.find()) {
//                String found = m.group(1);
//                String stars = "*".repeat(found.length());   // đúng độ dài từ nhạy cảm
//                m.appendReplacement(sb, Matcher.quoteReplacement(stars));
//            }
//            m.appendTail(sb);
//
//            return sb.toString();
//        }
//
//        // 3) nếu > maxLen thì cắt bằng substring + StringBuilder, không cắt ngang từ
//        static String shorten(String text, int maxLen) {
//            if (text == null) return null;
//            if (text.length() <= maxLen) return text;
//
//            int cut = maxLen;
//
//            // nếu vị trí cắt đang nằm giữa 1 từ (ký tự trước và sau đều không phải khoảng trắng) thì lùi về dấu cách gần nhất
//            while (cut > 0 && !Character.isWhitespace(text.charAt(cut - 1))) {
//                cut--;
//            }
//
//            // nếu không tìm được khoảng trắng (vd 1 từ siêu dài) thì cắt cứng tại maxLen
//            if (cut == 0) cut = maxLen;
//
//            StringBuilder sb = new StringBuilder();
//            sb.append(text, 0, cut);
//            sb.append("...");
//            return sb.toString();
//        }
//    }
//
//}
