#include <iostream>
#include <string>
#include <vector>
#include <map>
#include <fstream>
#include <sstream>
using namespace std;
struct Movie{
    vector<string> name;
    vector<string> movie_name;
    vector<string> seat;
    vector<int> reserve_seat;
    vector<int> movie_price;
    vector<string> date;
    string movie_room;
};
//어바웃 타임 /리처드 커티스/ 11000 20230605 a
//movie_name/ name / movie_price / date / movie_room
void origin_loadData(Movie& movie){
    string str;
    ifstream ifs("origin.txt");
    int j = 0;
    int i = 0;
    int type = 0;
    while(getline(ifs,str)){
        while(str[i] != '/') i++;
        j = i+1;
        while(str[j] != '/') j++;
        movie.movie_name.push_back(str.substr(i+1, j-i-1));
        movie.name.push_back(str.substr(0,i-1));
        j+=2;
        i = j;
        while(str[j] != ' ') j++;
        movie.movie_price.push_back(stoi(str.substr(i,j-i)));
        i = j+1;
        while(str[i] != ' ') i++;
        movie.date.push_back(str.substr(j+1,i-j));
        movie.movie_room.push_back(str[str.size()-1]);
        i = 0; j = 0;
    }
    ifs.close();
    int k = 0;
    for(char i = 'A'; i <= 'D'; i++){
        for(char j = '1'; j <= '5'; j++){
            string str = "";
            str += i;
            str += j;
            movie.seat.push_back(str);
            k++;
        }

    }
    
    // cout << "movie_name" << endl;
    // for(int i = 0; i < movie.movie_name.size(); i++){
    //     cout << movie.movie_name[i] << endl;
    // }
    // cout << "name" << endl;
    // for(int i = 0; i < movie.name.size(); i++){
    //     cout << movie.name[i] << endl;
    // }
    // cout << "movieprice" << endl;
    // for(int i = 0; i < movie.movie_price.size(); i++){
    //     cout << movie.movie_price[i] << endl;
    // }
    // cout << "movie_date" << endl;
    // for(int i = 0; i < movie.date.size(); i++){
    //     cout << movie.date[i] << endl;
    // }
    // cout << "movie_room" << endl;
    // for(int i = 0; i < movie.movie_room.size(); i++){
    //     cout << movie.movie_room[i] << endl;
    // }
    // cout << "seat" << endl;
    // for(int i = 0; i < movie.seat.size(); i++){
    //     cout << movie.seat[i] << endl;
    // }
}
    

int main(){
    Movie movie;
    origin_loadData(movie);
    return 0;
}