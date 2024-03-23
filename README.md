﻿# 21020407-Testing

Họ và tên: Nguyễn Đức Thiện
MSV: 21020407
Bài tập kiểm thử chức năng

Cách chạy project:

1. Mở cmd, run "mvn clean install "
2. Bấm các nút test trong file test để chạy

Mô tả bài toán: 
1. Rạp chiếu phim A có các giá vé xem phim khác nhau với từng độ tuổi. Nếu xem vào hai ngày thứ 7, chủ nhật thì giá sẽ cao hơn 20%.
  Giá vé
    Người trẻ từ 0 tuổi - 22 tuổi: 50.000 VND
    Người lớn trên 22 tuổi: 100.000VND
    Nếu dữ liệu tuổi nhỏ hơn 0 hoặc lớn hơn 200 sẽ báo lỗi
  Thời gian xem
    Các ngày từ thứ 2 -> thứ 6
    Ngày thứ 7 và chủ nhật
2. Phân tích bài toán
  Xác định yêu cầu
    Xác định tuổi của khách hàng
    Xác định ngày khách hàng đi xem phim
  Thu thập dữ liệu đầu vào
    Cung cấp thông tin về tuổi và thời gian đi xem phim của khách hàng
  Xây dựng logic tính toán
    Sử dụng thông tin về độ tuổi để tính số tiền phải trả
    Sử dụng các quy định về giá vé để cung cấp số tiền phải trả
  Hiển thị kết quả
    In ra số tiền khách hàng phải trả
