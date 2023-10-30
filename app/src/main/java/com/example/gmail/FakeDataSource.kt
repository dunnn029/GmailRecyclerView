package com.example.gmail

class FakeDataSource {
    fun getListMail(): ArrayList<MailData> {
        val data = ArrayList<MailData>()

        data.add(MailData(
            1,
            "Apple",
            "Xem công bố đặc biệt từ Apple",
            "Ngày 31 tháng 10 năm 2023 07:00 sáng, giờ Việt Nam",
            "12:10 25 thg 10"
        ))

        data.add(MailData(
            2,
            "Steam Team",
            "New sign-in to Steam",
            "New sign-in to Steam from your account \"dunnn029\", location of sign in: Hanoi, Ha Noi, VN",
            "10:24 23 thg 10"
        ))

        data.add(MailData(
            3,
            "Steam",
            "New Steam Account Email Verification",
            "To continue creating your new Steam account, please verify your email address below.",
            "10:20 23 thg 10"
        ))

        data.add(MailData(
            4,
            "Shopee",
            "Đơn hàng #2310188MKYFEPF đã giao hàng thành công",
            "Đơn hàng #2310188MKYFEPF của bạn đã được giao thành công ngày 21/10/2023.",
            "12:21 21 thg 10"
        ))

        data.add(MailData(
            5,
            "Ngân hàng số Cake by VPBank",
            "TUẦN LỄ VÀNG 20/10 \"TẶNG 0.2% LÃI SUẤT KHI GỬI TIẾT KIỆM\"",
            "TUẦN LỄ VÀNG 20/10 \"TẶNG 0.2% LÃI SUẤT KHI GỬI TIẾT KIỆM\"",
            "15:04 20 thg 10"
        ))

        data.add(MailData(
            6,
            "Apple",
            "Giới thiệu Apple Watch Series 9 và Apple Watch Ultra 2",
            "Thông minh hơn. Sáng hơn. Quyền năng hơn.",
            "08:17 20 thg 10"
        ))

        data.add(MailData(
            7,
            "Sun* xseeds (via Slack)",
            "Toshikazu Matsunami sent you messages",
            "@toshikazu.matsunami mentioned you in #hust_itssinjapanese1-k65",
            "09:17 17 thg 10"
        ))

        data.add(MailData(
            8,
            "Steven Cymatics",
            "yoo Dung,  you’re invited!",
            "Hey Dung, I have 2 pieces of good news!",
            "02:39 17 thg 10"
        ))

        data.add(MailData(
            9,
            "Nguyen Hoang Long",
            "[SAMSUNG SRV] CHƯƠNG TRÌNH HỌC BỔNG TÀI NĂNG STP ĐỢT 2 2023",
            "Thân gửi ứng viên tiềm năng!\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "SAMSUNG SRV là nơi ươm mầm và phát triển tài năng Việt cho các bạn sinh viên có đam mê về Khoa học Công nghệ. Để khích lệ tinh thần và giúp các bạn sinh viên có cơ hội trải nghiệm ở một môi trường doanh nghiệp năng động, hiện đại, Trung tâm Nghiên cứu và Phát triển Samsung Việt Nam (SRV) giới thiệu tới bạn chương trình Học bổng tài năng STP Đợt 2 2023 dành cho các bạn sinh viên tốt nghiệp 06/2024 hoặc 12/2024.\n" +
                    "\n" +
                    "Trung tâm SRV xin gửi thông tin chi tiết tới các bạn sinh viên về chương trình Học bổng STP Đợt 2 2023 như sau:",
            "20:20 13 thg 10"
        ))

        data.add(MailData(
            10,
            "YouTube Gaming",
            "LEVEL UP | PHIÊN BẢN THỨ 3",
            "Hành trình về quá khứ khi chúng ta tôn vinh Cộng đồng trò chơi cổ điển trên YouTube và những nhà sáng tạo vẫn đang thổi hồn vào những câu chuyện, trò chơi, thiết bị và kỷ niệm đó.",
            "06:38 13 thg 10"
        ))

        data.add(MailData(
            11,
            "Steven Cymatics",
            "let me know Dung",
            "Hey Dung,\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "We’re working on something special…\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "(New Cymatics plugins?)\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "As a company, we’re always striving to go above and beyond for the producers in our community.",
            "02:52 10 thg 10"
        ))

        data.add(MailData(
            12,
            "Tiembanhitt.vn",
            "Thông báo xác nhận đơn hàng #152899",
            "Cám ơn bạn đã mua hàng!\n" +
                    "Xin chào Dũng, Chúng tôi đã nhận được đặt hàng của bạn và đã sẵn sàng để vận chuyển. Chúng tôi sẽ thông báo cho bạn khi đơn hàng được gửi đi.",
            "22:07 9 thg 10"
        ))

        data.add(MailData(
            13,
            "Tiembanhitt.vn",
            "Hoàn thành đơn hàng của bạn",
            "Giỏ hàng đang chờ bạn hoàn tất\n" +
                    "Chào Dũng, chúng tôi nhận thấy có một vài sản phẩm vẫn còn trong giỏ hàng. Nếu bạn muốn hoàn tất đơn hàng, hãy quay lại để tiếp tục.",
            "22:00 9 thg 10"
        ))

        data.add(MailData(
            14,
            "GitHub",
            "[GitHub] A third-party OAuth application has been added to your account",
            "A third-party OAuth application (JetBrains IDE Integration) with gist, read:org, repo, and workflow scopes was recently authorized to access your account.",
            "12:21 8 thg 10"
        ))

        data.add(MailData(
            15,
            "Find My",
            "Đã tắt ứng dụng Tìm trên iPhone của Dung",
            "Khi ứng dụng Tìm bị tắt, bạn không thể định vị, chuyển sang Chế Độ Mất hoặc xóa thiết bị này từ xa bằng icloud.com/find hoặc ứng dụng Tìm được nữa.",
            "20:21 2 thg 10"
        ))

        data.add(MailData(
            16,
            "Niko from Codeanywhere",
            "Progressive Delivery",
            "I trust this message finds you well and coding happily this magnificent Thursday.",
            "20:27 14 thg 9"
        ))

        data.add(MailData(
            17,
            "ArtStation",
            "Keen Art published artwork \"STARFALL ISLAND\"",
            "Keen Art published new artwork. See it here: STARFALL ISLAND.",
            "23:31 7 thg 9"
        ))

        data.add(MailData(
            18,
            "Microsoft",
            "Nội dung cập nhật trong điều khoản sử dụng của chúng tôi",
            "Thỏa thuận Dịch vụ của bạn sẽ được cập nhật để làm rõ nội dung hơn",
            "03:01 7 thg 9"
        ))

        return data
    }
}